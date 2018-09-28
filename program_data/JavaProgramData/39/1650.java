public class student
{
	public String name = new String(new char[21]);
	public int test;
	public int examine;
	public char ganbu;
	public char west;
	public int paper;
	public int jiang;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].test = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].examine = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
			stu[i].jiang = 0;
			if (stu[i].test > 80 && stu[i].paper > 0)
			{
				stu[i].jiang += 8000;
			}
			if (stu[i].test > 85 && stu[i].examine > 80)
			{
				stu[i].jiang += 4000;
			}
			if (stu[i].test > 90)
			{
				stu[i].jiang += 2000;
			}
			if (stu[i].test > 85 && stu[i].west == 'Y')
			{
				stu[i].jiang += 1000;
			}
			if (stu[i].examine > 80 && stu[i].ganbu == 'Y')
			{
				stu[i].jiang += 850;
			}
		}
		int m = 0;
		int max;
		int sum;

		max = stu[0].jiang;
		sum = stu[0].jiang;

		for (i = 1;i < n;i++)
		{
			if (stu[i].jiang > max)
			{
				m = i;
				max = stu[i].jiang;
			}
			sum = sum + stu[i].jiang;
		}
		System.out.printf("%s\n%d\n%d",stu[m].name,max,sum);
	}









}

