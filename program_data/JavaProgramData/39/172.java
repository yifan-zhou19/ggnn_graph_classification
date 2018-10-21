package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char num[21];
	//		int scor1;
	//		int scor2;
	//		char g;
	//		char x;
	//		int lun;
	//		int ss;
	//	}
	//	stu[100];
		int i;
		int n;
		int sum = 0;
		student max = new student();

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
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].scor1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].scor2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].g = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].x = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lun = tempVar7;
			}
			stu[i].ss = 0;
		}

		for (i = 0;i < n;i++)
		{
			if (stu[i].scor1 > 80 && stu[i].lun > 0)
			{
				stu[i].ss += 8000;
			}

			if (stu[i].scor1 > 85 && stu[i].scor2 > 80)
			{
				stu[i].ss += 4000;
			}

			if (stu[i].scor1 > 90)
			{
				stu[i].ss += 2000;
			}

			if (stu[i].scor1 > 85 && stu[i].x == 'Y')
			{
				stu[i].ss += 1000;
			}

			if (stu[i].scor2 > 80 && stu[i].g == 'Y')
			{
				stu[i].ss += 850;
			}
		}

		max = stu[0];
		for (i = 0;i < n;i++)
		{
			if (stu[i].ss > max.ss)
			{
				max = stu[i];
			}
			sum += stu[i].ss;
		}
		System.out.printf("%s\n",max.num);
		System.out.printf("%d\n",max.ss);
		System.out.printf("%d\n",sum);
	}
}

