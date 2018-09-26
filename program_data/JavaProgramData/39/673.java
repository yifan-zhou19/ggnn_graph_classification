public class student
{
	public String name = new String(new char[20]);
	public int a;
	public int b;
	public char c;
	public char d;
	public int e;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int f1(int a, int b)
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
	public static int f2(int a, int b)
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
	public static int f3(int a)
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
	public static int f4(int a, char b)
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
	public static int f5(int a, char b)
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
				stu[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].c = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].d = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].e = Integer.parseInt(tempVar7);
			}
			stu[i].sum = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (f1(stu[i].a, stu[i].e) == 1)
			{
				stu[i].sum += 8000;
				sum += 8000;
			}
			if (f2(stu[i].a, stu[i].b) == 1)
			{
				stu[i].sum += 4000;
				sum += 4000;
			}
			if (f3(stu[i].a) == 1)
			{
				stu[i].sum += 2000;
				sum += 2000;
			}
			if (f4(stu[i].a, stu[i].d) == 1)
			{
				stu[i].sum += 1000;
				sum += 1000;
			}
			if (f5(stu[i].b, stu[i].c) == 1)
			{
				stu[i].sum += 850;
				sum += 850;
			}
		}
		k = stu[0].sum;
		for (i = 0;i < n;i++)
		{
			if (k < stu[i].sum)
			{
				j = i;
				k = stu[i].sum;
			}
		}
		System.out.printf("%s\n%d\n%d",stu[j].name,stu[j].sum,sum);
		return 0;
	}
}

