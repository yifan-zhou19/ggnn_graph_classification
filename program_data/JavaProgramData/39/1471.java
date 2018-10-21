package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int maxmoney;
		int sum = 0;
		String name = new String(new char[21]);
		String maxname = new String(new char[21]);
		int[] qimo = new int[100];
		int[] banji = new int[100];
		String ganbu = new String(new char[100]);
		String xibu = new String(new char[100]);
		int[] lunwen = new int[100];
		int[] money = new int[100];
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
				name = tempVar2.charAt(0);
			}


			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				qimo[i - 1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				banji[i - 1] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				ganbu = tangible.StringFunctions.changeCharacter(ganbu, i - 1, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xibu = tangible.StringFunctions.changeCharacter(xibu, i - 1, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				lunwen[i - 1] = Integer.parseInt(tempVar7);
			}
			if (qimo[i - 1] > 80 && lunwen[i - 1] >= 1)
			{
				money[i - 1] = money[i - 1] + 8000;
			}
			if (qimo[i - 1] > 85 && banji[i - 1] > 80)
			{
				money[i - 1] = money[i - 1] + 4000;
			}
			if (qimo[i - 1] > 90)
			{
				money[i - 1] = money[i - 1] + 2000;
			}
			if (qimo[i - 1] > 85 && xibu.charAt(i - 1) == 'Y')
			{
				money[i - 1] = money[i - 1] + 1000;
			}
			if (banji[i - 1] > 80 && ganbu.charAt(i - 1) == 'Y')
			{
				money[i - 1] = money[i - 1] + 850;
			}
			if (i == 1)
			{
				maxmoney = money[0];
				maxname = name;
			}
			sum = sum + money[i - 1];
			if (i >= 2)
			{

			if (money[i - 1] > maxmoney)

			{
				maxmoney = money[i - 1];
				maxname = name;

			}

			}
		}


		System.out.printf("%s\n",maxname);
		System.out.printf("%d\n",maxmoney);
		System.out.printf("%d\n",sum);


		return 0;
	}

}

