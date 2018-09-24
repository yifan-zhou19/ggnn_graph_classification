public class student
{
	public String name = new String(new char[20]);
	public int fs;
	public int cs;
	public char gb;
	public char xb;
	public int paper;
	public int sch;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int ys(int a, int b)
	{
		if (a > 80 && b >= 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int ws(int a, int b)
	{
		if (a > 85 && b > 80)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int cj(int a)
	{
		if (a > 90)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int xibu(int a, char b)
	{
		if (a > 85 && b == 'Y')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int bj(int a, char b)
	{
		if (a > 80 && b == 'Y')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int sum = 0;
		int k = 0;
		int j = 0;
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
				stu[i].fs = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].cs = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
			stu[i].sch = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (ys(stu[i].fs, stu[i].paper) == 1)
			{
				stu[i].sch += 8000;
				sum += 8000;
			}
			if (ws(stu[i].fs, stu[i].cs) == 1)
			{
				stu[i].sch += 4000;
				sum += 4000;
			}
			if (cj(stu[i].fs) == 1)
			{
				stu[i].sch += 2000;
				sum += 2000;
			}
			if (xibu(stu[i].fs, stu[i].xb) == 1)
			{
				stu[i].sch += 1000;
				sum += 1000;
			}
			if (bj(stu[i].cs, stu[i].gb) == 1)
			{
				stu[i].sch += 850;
				sum += 850;
			}
		}
		k = stu[0].sch;
		for (i = 0;i < n;i++)
		{
			if (k < stu[i].sch)
			{
				j = i;
				k = stu[i].sch;
			}
		}
		System.out.printf("%s\n%d\n%d",stu[j].name,stu[j].sch,sum);
		return 0;
	}

}

