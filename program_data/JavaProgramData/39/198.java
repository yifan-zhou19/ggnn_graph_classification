package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct information
	//	{
	//		char name[20];
	//		int qimo;
	//		int banji;
	//		char ganbu;
	//		char xibu;
	//		int lunwen;
	//		int money;
	//	}
	//	info[100];
		int n;
		int max;
		int sum = 0;
		int i;
		String scholar = new String(new char[20]);
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
				info[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				info[i].qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				info[i].banji = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				info[i].ganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				info[i].xibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				info[i].lunwen = tempVar7;
			}
			info[i].money = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (info[i].qimo > 80 && info[i].lunwen > 0)
			{
				info[i].money += 8000;
			}
			if (info[i].qimo > 85 && info[i].banji > 80)
			{
				info[i].money += 4000;
			}
			if (info[i].qimo > 90)
			{
				info[i].money += 2000;
			}
			if (info[i].qimo > 85 && info[i].xibu == 'Y')
			{
				info[i].money += 1000;
			}
			if (info[i].banji > 80 && info[i].ganbu == 'Y')
			{
				info[i].money += 850;
			}
			sum += info[i].money;
		}
		scholar = info[0].name;
		max = info[0].money;
		for (i = 0;i < n;i++)
		{
			if (max < info[i].money)
			{
				max = info[i].money;
				scholar = info[i].name;
			}
		}
		System.out.printf("%s\n%d\n%d\n",scholar,max,sum);
	}

}

