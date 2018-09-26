package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int total = 0;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[21];
	//		int FinalScore;
	//		int ClassScore;
	//		char u;
	//		char w;
	//		int a;
	//		int money;
	//	}
	//	stu,max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max.money = -1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu.FinalScore = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu.ClassScore = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu.u = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu.w = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu.a = tempVar7;
			}
			stu.money = 0;
			if (stu.FinalScore > 80 && stu.a > 0)
			{
				stu.money += 8000;
			}
			if (stu.FinalScore > 85 && stu.ClassScore > 80)
			{
				stu.money += 4000;
			}
			if (stu.FinalScore > 90)
			{
				stu.money += 2000;
			}
			if (stu.FinalScore > 85 && stu.w == 'Y')
			{
				stu.money += 1000;
			}
			if (stu.ClassScore > 80 && stu.u == 'Y')
			{
				stu.money += 850;
			}
			total += stu.money;
			if (stu.money > max.money)
			{
				max = stu;
			}
		}
		System.out.printf("%s\n%d\n%d\n",max.name,max.money,total);
	}
}

