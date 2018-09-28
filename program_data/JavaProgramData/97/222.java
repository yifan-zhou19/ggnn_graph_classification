package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int bai = 0;
		int wushi = 0;
		int ershi = 0;
		int shi = 0;
		int wu = 0;
		int yi = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		bai = n / 100;
		n = n % 100;
		wushi = n / 50;
		n = n % 50;
		while (n >= 20)
		{
			ershi += 1;
			n = n - 20;
		}
		if (n >= 10)
		{
		shi = n / 10;
		n = n - 10;
		}
		if (n >= 5)
		{
			wu = 1;
			n = n - 5;
		}
		yi = n;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",bai,wushi,ershi,shi,wu,yi);
	}

}

