public class student
{
	public String name = new String(new char[20]);
	public int g;
	public int e;
	public char m;
	public char w;
	public int p;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(N);
	public static void Main()
	{
		int[] award = new int[N];
		int AWARD = struct student stu;
		int n;
		int i;
		int j;
		int sum = 0;
		int max = 0;
		int maxi = 0;
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
				stu[i].g = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].e = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].m = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].w = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].p = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			award[i] = AWARD(stu[i]);
			sum = sum + award[i];
			if (award[i] > max)
			{
				max = award[i];
				maxi = i;
			}
		}
		System.out.printf("%s\n%d\n",stu[maxi].name,max);
		System.out.printf("%d",sum);
	}
	public static int AWARD(student stu)
	{
		int sum = 0;
		if (stu.g > 80 && stu.p > 0)
		{
			sum = sum + 8000;
		}
		if (stu.g > 85 && stu.e > 80)
		{
			sum = sum + 4000;
		}
		if (stu.g > 90)
		{
			sum = sum + 2000;
		}
		if (stu.g > 85 && stu.w == 'Y')
		{
			sum = sum + 1000;
		}
		if (stu.e > 80 && stu.m == 'Y')
		{
			sum = sum + 850;
		}
		return (sum);
	}
}

