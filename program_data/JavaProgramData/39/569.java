package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int final;
	//		int com;
	//		char offi;
	//		char west;
	//		int arc;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(200);
		student chan = new student();
		int i;
		int n;
		int[] total = new int[200];
		int all = 0;
		int a;
		int b;
		int temp;
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
				stu[i].final = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].com = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].offi = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].arc = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((stu[i].final > 80) && (stu[i].arc > 0))
			{
			total[i] = total[i] + 8000;
			}
			if ((stu[i].final > 85) && (stu[i].com > 80))
			{
			total[i] = total[i] + 4000;
			}
			if (stu[i].final > 90)
			{
			total[i] = total[i] + 2000;
			}
			if ((stu[i].final > 85) && (stu[i].west == 89))
			{
			total[i] = total[i] + 1000;
			}
			if ((stu[i].com > 80) && (stu[i].offi == 89))
			{
			total[i] = total[i] + 850;
			}
		}
		for (a = 0;a < n - 1;a++)
		{
			for (b = 0;b < n - 1 - a;b++)
			{
				if (total[b] < total[b + 1])
				{
					temp = total[b];
					total[b] = total[b + 1];
					total[b + 1] = temp;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: chan=stu[b];
					chan.copyFrom(stu[b]);
					stu[b] = stu[b + 1];
					stu[b + 1] = chan;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
		all = all + total[i];
		}
		System.out.printf("%s\n%d\n%d\n",stu[0].name,total[0],all);
		return 0;
	}

}

