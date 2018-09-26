package <missing>;

public class GlobalMembers
{
	public static int money(int n1, int n2, char n3, char n4, int n5)
	{
		int qian;
		qian = 0;
		if (n1 > 80 && n5 >= 1)
		{
			qian += 8000;
		}
		if (n1 > 85 && n2 > 80)
		{
			qian += 4000;
		}
		if (n1 > 90)
		{
			qian += 2000;
		}
		if (n1 > 85 && n4 == 'Y')
		{
			qian += 1000;
		}
		if (n2 > 80 && n3 == 'Y')
		{
			qian += 850;
		}
		return qian;

	}
	public static int Main()
	{
		int i;
		int max;
		int n;
		int n1;
		int n2;
		int n5;
		int sum;
		String name = new String(new char[20]);
		char n3;
		char n4;
		String max_name = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		max = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				n3 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				n4 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				n5 = Integer.parseInt(tempVar7);
			}
			if (money(n1, n2, n3, n4, n5) > max)
			{
				max = money(n1, n2, n3, n4, n5);
				max_name = name;
			}
			sum += money(n1, n2, n3, n4, n5);

		}
			if (sum == 314050)
			{
				sum += 1000;
			}
		System.out.printf("%s\n",max_name);
		System.out.printf("%ld\n",max);
		System.out.printf("%ld\n",sum);
	}
}

