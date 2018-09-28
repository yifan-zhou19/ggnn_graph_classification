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
	//		char name[20];
	//		int score;
	//		int judge;
	//		char work;
	//		char west;
	//		int paper;
	//		int money;
	//	}
	//	stu[100];
		int i;
		for (i = 0;i < n;i++)
		{
			stu[i].money = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].score = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].judge = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].work = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7;
			}
			if (stu[i].score > 80 && stu[i].paper >= 1)
			{
				stu[i].money = stu[i].money + 8000;
			}
			if (stu[i].score > 85 && stu[i].judge > 80)
			{
				stu[i].money = stu[i].money + 4000;
			}
			if (stu[i].score > 90)
			{
				stu[i].money = stu[i].money + 2000;
			}
			if (stu[i].score > 85 && stu[i].west == 'Y')
			{
				stu[i].money = stu[i].money + 1000;
			}
			if (stu[i].judge > 80 && stu[i].work == 'Y')
			{
				stu[i].money = stu[i].money + 850;
			}
		}
		int max = 0;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum = sum + stu[i].money;
			if (stu[i].money > max)
			{
				max = stu[i].money;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].money == max)
			{
				System.out.printf("%s\n%d\n",stu[i].name,max);
			break;
			}
		}
		System.out.printf("%d\n",sum);
	}








}

