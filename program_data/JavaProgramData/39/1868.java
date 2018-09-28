public class student
{
		public String name = new String(new char[20]);
		public int s1;
		public int s2;
		public char gb;
		public char w;
		public int p;
		public int m;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int sum = 0;
		int n;
		int max = 0;
		int t;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
		stu[i].m = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(stu[i].name) = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(stu[i].s1) = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			(stu[i].s2) = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			(stu[i].gb) = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			(stu[i].w) = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			(stu[i].p) = Integer.parseInt(tempVar7);
		}
		if (stu[i].s1 > 80 && stu[i].p > 0)
		{
			stu[i].m = stu[i].m + 8000;
		}
		if (stu[i].s1 > 85 && stu[i].s2 > 80)
		{
			stu[i].m = stu[i].m + 4000;
		}
		if (stu[i].s1 > 90)
		{
			stu[i].m = stu[i].m + 2000;
		}
		if (stu[i].s1 > 85 && stu[i].w == 'Y')
		{
			stu[i].m = stu[i].m + 1000;
		}
		if (stu[i].s2 > 80 && stu[i].gb == 'Y')
		{
			stu[i].m = stu[i].m + 850;
		}
		sum = sum + stu[i].m;
		}

		for (i = 0;i < n;i++)
		{
		if (stu[i].m > max)
		{
		max = stu[i].m;
		}
		}

		for (i = 0;i < n;i++)
		{
		if (stu[i].m == max)
		{
		System.out.printf("%s\n%d\n%d",stu[i].name,max,sum);
		break;
		}
		}
	}
}

