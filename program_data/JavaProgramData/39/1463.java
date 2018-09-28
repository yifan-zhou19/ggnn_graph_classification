package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int s;
		int all = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int avg;
	//		int cls;
	//		char aso[2];
	//		char wst[2];
	//		int pap;
	//		int mny;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(101);
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
				stu[i].avg = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].cls = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				stu[i].aso = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				stu[i].wst = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].pap = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].mny = 0;
		}
		for (i = 0;i < n;i++)
		{
			if ((stu[i].avg > 80) & (stu[i].pap >= 1))
			{
				stu[i].mny = stu[i].mny + 8000;
			}
			if ((stu[i].avg > 85) & (stu[i].cls > 80))
			{
				stu[i].mny = stu[i].mny + 4000;
			}
			if (stu[i].avg > 90)
			{
				stu[i].mny = stu[i].mny + 2000;
			}
			if ((stu[i].avg > 85) & (stu[i].wst[0] == 'Y'))
			{
				stu[i].mny = stu[i].mny + 1000;
			}
			if ((stu[i].cls > 80) & (stu[i].aso[0] == 'Y'))
			{
				stu[i].mny = stu[i].mny + 850;
			}
		}
		s = stu[0].mny;
		for (i = 1;i < n;i++)
		{
			if (stu[i].mny > s)
			{
				s = stu[i].mny;
				j = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			all = all + stu[i].mny;
		}
		System.out.printf("%s\n",stu[j].name);
		System.out.printf("%d\n",s);
		System.out.printf("%d",all);
	}
}

