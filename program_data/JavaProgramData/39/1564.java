package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		char n[20];
	//		int p1,p2,p3;
	//		char a,b;
	//	}
	//	st[100];
		int[] money = new int[100];
		int i;
		int num;
		int sum = 0;
		int m;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st[i].n = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				st[i].p1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				st[i].p2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				st[i].a = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				st[i].b = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				st[i].p3 = tempVar7;
			}
		}
		for (i = 0;i < num;i++)
		{
			if (st[i].p1 > 80 && st[i].p3 >= 1)
			{
				money[i] += 8000;
			}
			if (st[i].p1 > 85 && st[i].p2 > 80)
			{
				money[i] += 4000;
			}
			if (st[i].p1 > 90)
			{
				money[i] += 2000;
			}
			if (st[i].p1 > 85 && (int)st[i].b == 'Y')
			{
				money[i] += 1000;
			}
			if (st[i].p2 > 80 && (int)st[i].a == 'Y')
			{
				money[i] += 850;
			}
		}
		m = money[0];
		h = 0;
		for (i = 1;i < num;i++)
		{
			if (money[i] > m)
			{
				m = money[i];
				h = i;
			}
		}
		for (i = 0;i < num;i++)
		{
			sum += money[i];
		}
		System.out.printf("%s\n",st[h].n);
		System.out.printf("%d\n",m);
		System.out.printf("%d\n",sum);
		return 0;
	}
}

