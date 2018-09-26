package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[32];
	//		int sco1;
	//		int sco2;
	//		char l;
	//		char w;
	//		int es;
	//		int scho;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		int i;
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
				stu[i].sco1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].sco2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].l = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].w = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].es = tempVar7;
			}
			stu[i].scho = 0;
			if (stu[i].sco1 > 80 && stu[i].es > 0)
			{
				stu[i].scho += 8000;
			}
			if (stu[i].sco1 > 85 && stu[i].sco2 > 80)
			{
				stu[i].scho += 4000;
			}
			if (stu[i].sco1 > 90)
			{
				stu[i].scho += 2000;
			}
			if (stu[i].sco1 > 85 && stu[i].w == 'Y')
			{
				stu[i].scho += 1000;
			}
			if (stu[i].sco2 > 80 && stu[i].l == 'Y')
			{
				stu[i].scho += 850;
			}
		}
		int max = stu[0].scho;
		for (i = 0;i < n;i++)
		{
		if (stu[i].scho > max)
		{
			max = stu[i].scho;
		}
		}
		for (i = 0;i < n;i++)
		{
		if (stu[i].scho == max)
		{
			System.out.printf("%s\n%d\n",stu[i].name,max);
			break;
		}
		}
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += stu[i].scho;
		}
		System.out.printf("%d\n",sum);
	}
}

