package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int maxmoney;
		int i;
		String maxname = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char name[20];
	//		int qimo;
	//		int banji;
	//		char ganbu;
	//		char xibu;
	//		int paper;
	//	}
	//	student[101];
		int[] money = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				student[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				student[i].qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				student[i].banji = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				student[i].ganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				student[i].xibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				student[i].paper = tempVar7;
			}
		}
		int total = 0;
		for (i = 1;i <= n;i++)
		{
			money[i] = 0;
			//printf("%d %d\n",student[i].qimo,student[i].paper);
			if ((student[i].qimo > 80) && (student[i].paper >= 1))
			{
				money[i] += 8000;
				//printf("%d\n",money[i]);
			}
			if ((student[i].qimo > 85) && (student[i].banji > 80))
			{
				money[i] += 4000;
				//printf("%d\n",money[i]);
			}
			if (student[i].qimo > 90)
			{
				money[i] += 2000;
			}
			//printf("%d\n",money[i]);
			if ((student[i].qimo > 85) && (student[i].xibu == 'Y'))
			{
				money[i] += 1000;
			}
			//printf("%d\n",money[i]);
			if ((student[i].banji > 80) && (student[i].ganbu == 'Y'))
			{
				money[i] += 850;
			}
			//printf("%d\n",money[i]);*/
			total = total + money[i];
		}

		maxmoney = money[1];
		maxname = student[1].name;
		for (i = 2;i <= n;i++)
		{
			if (money[i] > maxmoney)
			{
				maxmoney = money[i];
				maxname = student[i].name;
			}

		}
		System.out.printf("%s\n%d\n%d\n",maxname,maxmoney,total);
		return 0;
	}
}

