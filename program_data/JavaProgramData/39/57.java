package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int qim,piny,lunw;
	//		char ganb,xib;
	//		int sum;
	//	};
		int i;
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(n); //////
	//	struct studen *stu[90];
		int max = 0;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			stu[i].sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].qim = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].piny = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].ganb = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xib = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lunw = tempVar7;
			}
			if (stu[i].qim > 80 && stu[i].lunw >= 1)
			{
				stu[i].sum += 8000;
			}
			if (stu[i].qim > 85 && stu[i].piny > 80)
			{
				stu[i].sum += 4000;
			}
			if (stu[i].qim > 90)
			{
				stu[i].sum += 2000;
			}
			if (stu[i].qim > 85 && stu[i].xib == 'Y')
			{
				stu[i].sum += 1000;
			}
			if (stu[i].piny > 80 && stu[i].ganb == 'Y')
			{
				stu[i].sum += 850;
			}
			if (stu[i].sum > max)
			{
				max = stu[i].sum;
				a = i;
			}
			sum += stu[i].sum;
		}
		System.out.printf("%s\n%d\n%d\n",stu[a].name,stu[a].sum,sum);
		return 0;
	}
}

