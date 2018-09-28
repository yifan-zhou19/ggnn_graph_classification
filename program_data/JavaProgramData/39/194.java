package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] sum = new int[100];
		int i;
		int n;
		int p = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[21];
	//		int a;
	//		int b;
	//		char c;
	//		char d;
	//		int e;
	//	}
	//	stu[100];
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
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].b = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].c = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].d = tempVar6;
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
				sum[i] += 8000;
			}
			if (stu[i].a > 85 && stu[i].b > 80)
			{
				sum[i] += 4000;
			}
			if (stu[i].a > 90)
			{
				sum[i] += 2000;
			}
			if (stu[i].a > 85 && stu[i].d == 'Y')
			{
				sum[i] += 1000;
			}
			if (stu[i].b > 80 && stu[i].c == 'Y')
			{
				sum[i] += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			p += sum[i];
		}
		for (i = 1;i < n;i++)
		{
			if (sum[0] < sum[i])
			{
				stu[0] = stu[i];
			sum[0] = sum[i];
			}
		}
		System.out.printf("%s\n",stu[0].name);
		System.out.printf("%d\n",sum[0]);
		System.out.printf("%d",p);
	}
}

