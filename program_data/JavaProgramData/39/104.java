package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int all = 0;
		int i;
		int j;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int score1;
	//		int score2;
	//		char monitor;
	//		char west;
	//		int paper;
	//		int money;
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
				stu[i].score1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].score2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].monitor = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].money = 0;
			if (stu[i].score1 > 80 && stu[i].paper >= 1)
			{
				stu[i].money += 8000;
			}
			if (stu[i].score1 > 85 && stu[i].score2 > 80)
			{
				stu[i].money += 4000;
			}
			if (stu[i].score1 > 90)
			{
				stu[i].money += 2000;
			}
			if (stu[i].score1 > 85 && stu[i].west == 'Y')
			{
				stu[i].money += 1000;
			}
			if (stu[i].score2 > 80 && stu[i].monitor == 'Y')
			{
				stu[i].money += 850;
			}
		}
		m = stu[0].money;
		j = 0;
		for (i = 0;i < n;i++)
		{

				if (stu[i].money > m)
				{
					m = stu[i].money;
					j = i;
				}

		}
		for (i = 0;i < n;i++)
		{
			all += stu[i].money;
		}
		System.out.printf("%s\n%d\n",stu[j].name,stu[j].money);


		System.out.printf("%d\n",all);
	}



}

