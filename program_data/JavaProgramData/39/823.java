package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[100];
	//		int qimo;
	//		int banji;
	//		char isGanbu[1];
	//		char isWest[1];
	//		int paper;
	//		int money;
	//	};
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
		int n;
		int i;
		int max;
		int maxnum;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			a[i].money = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].banji = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[i].isGanbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				a[i].isWest = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[i].paper = tempVar7;
			}
			if (a[i].qimo > 80 && a[i].paper > 0)
			{
				a[i].money += 8000;
			}
			if (a[i].qimo > 85 && a[i].banji > 80)
			{
				a[i].money += 4000;
			}
			if (a[i].qimo > 90)
			{
				a[i].money += 2000;
			}
			if (a[i].qimo > 85 && a[i].isWest[0] == 'Y')
			{
				a[i].money += 1000;
			}
			if (a[i].banji > 80 && a[i].isGanbu[0] == 'Y')
			{
				a[i].money += 850;
			}
		}
		max = 0;
		sum = 0;
		for (i = 0; i < n; i++)
		{
			if (a[i].money > max)
			{
				max = a[i].money;
				maxnum = i;
			}
		}
		for (i = 0; i < n; i++)
		{
			sum += a[i].money;
		}
		System.out.printf("%s\n",a[maxnum].name);
		System.out.printf("%d\n%d", max, sum);
		return 0;
	}
}

