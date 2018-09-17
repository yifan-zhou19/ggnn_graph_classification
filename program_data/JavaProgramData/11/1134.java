package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ye;
		int mo;
		int da;
		int i;
		int sum = 0;
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ye = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mo = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			da = Integer.parseInt(tempVar3);
		}

		for (i = 1; i < mo; i++)
		{
			sum = sum + mon[i];
		}
		if (((ye % 400 == 0) && mo > 2) || ((ye % 4 == 0) && (ye % 100 != 0)) && mo > 2)
		{
			sum = sum + da + 1;
		}
		else
		{
			sum = sum + da;
		}

		System.out.printf("%d", sum);

		return 0;
	}

}

