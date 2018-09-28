public class student
{
	public String name = new String(new char[20]);
	public int mark;
	public int re;
	public char work;
	public char west;
	public int paper;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		int max = 0;
		int l;
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
				stu[i].mark = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].re = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				stu[i].work = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
			stu[i].sum = 0;
			if (stu[i].mark > 80 && stu[i].paper > 0)
			{
				stu[i].sum += 8000;
			}
			if (stu[i].mark > 85 && stu[i].re > 80)
			{
				stu[i].sum += 4000;
			}
			if (stu[i].mark > 90)
			{
				stu[i].sum += 2000;
			}
			if (stu[i].mark > 85 && stu[i].west == 'Y')
			{
				stu[i].sum += 1000;
			}
			if (stu[i].re > 80 && stu[i].work == 'Y')
			{
				stu[i].sum += 850;
			}
			sum = sum + stu[i].sum;
		}
		for (i = 0;i < n;i++)
		{
			if (max < stu[i].sum)
			{
				max = stu[i].sum;
				l = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[l].name,max,sum);
	}


}

