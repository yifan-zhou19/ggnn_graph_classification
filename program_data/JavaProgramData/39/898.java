package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] name = new char[105][20];
		int[] qimo = new int[105];
		int[] banji = new int[105];
		int[] lunwen = new int[105];
		String xibu = new String(new char[105]);
		String ganbu = new String(new char[105]);
		int[] money = new int[105];
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				qimo[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				banji[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				ganbu = tangible.StringFunctions.changeCharacter(ganbu, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xibu = tangible.StringFunctions.changeCharacter(xibu, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				lunwen[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (qimo[i] > 80 && lunwen[i] >= 1)
			{
				money[i] = money[i] + 8000;
			}
			if (qimo[i] > 85 && banji[i] > 80)
			{
				money[i] = money[i] + 4000;
			}
			if (qimo[i] > 90)
			{
				money[i] = money[i] + 2000;
			}
			if (qimo[i] > 85 && xibu.charAt(i) == 'Y')
			{
				money[i] = money[i] + 1000;
			}
			if (banji[i] > 80 && ganbu.charAt(i) == 'Y')
			{
				money[i] = money[i] + 850;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (money[i] > max)
			{
				max = money[i];
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (money[i] == max)
			{
				System.out.printf("%s\n",name[i]);
				break;
			}
		}
		System.out.printf("%d\n",max);
		m = 0;
		for (i = 1;i <= n;i++)
		{
			m = m + money[i];
		}
		System.out.printf("%d\n",m);

		return 0;
	}
}

