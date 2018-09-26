package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int all = 0;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int score1;
	//		int score2;
	//		char ganbu;
	//		char west;
	//		int article;
	//		int money;
	//	}
	//	stu[100],temp;
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
				stu[i].ganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].article = tempVar7;
			}
		} //?????????
		//???????????????????
		for (i = 0;i < n;i++)
		{
			stu[i].money = 0;
			if (stu[i].score1 > 80 && stu[i].article >= 1)
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
			if (stu[i].score2 > 80 && stu[i].ganbu == 'Y')
			{
				stu[i].money += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (stu[j].money < stu[j + 1].money)
				{
					temp = stu[j];
					stu[j] = stu[j + 1];
					stu[j + 1] = temp;
				}
			}
		}
		System.out.printf("%s\n",stu[0].name);
		System.out.printf("%d\n",stu[0].money);
		for (i = 0;i < n;i++)
		{
			all += stu[i].money;
		}
		System.out.printf("%d\n",all);
	}



}

