package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct student
	//   {
	//	   char name[20];
	// int grade;
	// int eva;
	// char pres;
	// char west;
	// int paper;
	// int money;
	//   }
	//   stu[100];

		int n;
		int i;
		int sum;
		int j;
		student p;
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
				stu[i].grade = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].eva = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].pres = tempVar5;
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
			if (stu[i].grade > 80 && stu[i].paper >= 1)
			{
				stu[i].money = stu[i].money + 8000;
			}
			if (stu[i].grade > 85 && stu[i].eva > 80)
			{
				stu[i].money = stu[i].money + 4000;
			}
			if (stu[i].grade > 90)
			{
				stu[i].money = stu[i].money + 2000;
			}
			if (stu[i].grade > 85 && stu[i].west == 'Y')
			{
				stu[i].money = stu[i].money + 1000;
			}
			if (stu[i].eva > 80 && stu[i].pres == 'Y')
			{
				stu[i].money = stu[i].money + 850;
			}
		}
		for (i = 0,sum = 0;i < n;i++)
		{
			sum = sum + stu[i].money;
		}
		for (i = 1, p = stu[0];i < n;i++)
		{
				if (stu[i].money > p.money)
				{
					p = stu + i;
				}
		}

	   System.out.printf("%s\n%d\n%d\n",p.name,p.money,sum);
	}


}

