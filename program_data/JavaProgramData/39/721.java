package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	char name[20];
	//	int a;
	//	int b;
	//	char s;
	//	char x;
	//	int e;
	//	}
	//	stu[100];
		int n;
		int[] m = new int[100];
		int max;
		int total;
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
			stu[i].name = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			stu[i].a = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			stu[i].b = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			stu[i].s = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			stu[i].x = tempVar6;
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			stu[i].e = tempVar7;
		}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].a > 80 && stu[i].e >= 1)
			{
				m[i] += 8000;
			}
			if (stu[i].a > 85 && stu[i].b > 80)
			{
				m[i] += 4000;
			}
			if (stu[i].a > 90)
			{
				m[i] += 2000;
			}
			if (stu[i].a > 85 && stu[i].x == 'Y')
			{
				m[i] += 1000;
			}
			if (stu[i].b > 80 && stu[i].s == 'Y')
			{
				m[i] += 850;
			}
		}
		max = 0;
		total = m[0];
		for (i = 1;i < n;i++)
		{
			if (m[i] > m[max])
			{
				max = i;
			}
			total += m[i];
		}
		System.out.printf("%s\n%d\n%d\n",stu[max].name,m[max],total);
		return 0;
	}

}

