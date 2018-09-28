package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sum;
		int z;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int exam;
	//		int cla;
	//		char lead;
	//		char west;
	//		int theo;
	//		int sch;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].exam = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].cla = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].lead = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].theo = tempVar7;
			}
		}

		for (i = 0; i < n; i++)
		{
			stu[i].sch = 0;
			if (stu[i].exam > 80 && stu[i].theo > 0)
			{
				stu[i].sch = stu[i].sch + 8000;
			}
			if (stu[i].exam > 85 && stu[i].cla > 80)
			{
				stu[i].sch = stu[i].sch + 4000;
			}
			if (stu[i].exam > 90)
			{
				stu[i].sch = stu[i].sch + 2000;
			}
			if (stu[i].exam > 85 && stu[i].west == 'Y')
			{
				stu[i].sch = stu[i].sch + 1000;
			}
			if (stu[i].cla > 80 && stu[i].lead == 'Y')
			{
				stu[i].sch = stu[i].sch + 850;
			}
		}

		z = 0;
		for (i = 0; i < n; i++)
		{
			if (stu[i].sch > stu[z].sch)
			{
				z = i;
			}
		}

		sum = 0;
		for (i = 0; i < n; i++)
		{
			sum = sum + stu[i].sch;
		}

		System.out.printf("%s\n", stu[z].name);
		System.out.printf("%d\n", stu[z].sch);
		System.out.printf("%d\n", sum);
	}

}

