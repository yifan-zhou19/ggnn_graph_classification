public class student
{
	public String name = new String(new char[20]);
	public int GPA;
	public int val;
	public char moni;
	public char west;
	public int paper;
	public int scholar;

}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int max = 0;
		int sum;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].GPA = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].val = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].moni = tempVar5.charAt(0);
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
		}
		for (i = 0;i <= n - 1;i++)
		{
			stu[i].scholar = 0;
			if (stu[i].GPA > 80 && stu[i].paper >= 1)
			{
				stu[i].scholar = stu[i].scholar + 8000;
			}
			if (stu[i].GPA > 85 && stu[i].val > 80)
			{
				stu[i].scholar = stu[i].scholar + 4000;
			}
			if (stu[i].GPA > 90)
			{
				stu[i].scholar = stu[i].scholar + 2000;
			}
			if (stu[i].GPA > 85 && stu[i].west == 'Y')
			{
				stu[i].scholar = stu[i].scholar + 1000;
			}
			if (stu[i].val > 80 && stu[i].moni == 'Y')
			{
				stu[i].scholar = stu[i].scholar + 850;
			}

		}
		for (i = 0,max = stu[0].scholar,sum = 0;i <= n - 1;i++)
		{
			if (stu[i].scholar > max)
			{
				k = i;
				max = stu[i].scholar;
			}
			sum = sum + stu[i].scholar;
		}

		System.out.printf("%s\n%d\n%d",stu[k].name,stu[k].scholar,sum);

	}
}

