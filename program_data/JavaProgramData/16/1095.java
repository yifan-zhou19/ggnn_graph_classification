package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int a1;
		int a2;
		int a3;
		int a4;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		a1 = a / 1000;
		b = a - a1 * 1000;
		a2 = b / 100;
		b = b - a2 * 100;
		a3 = b / 10;
		a4 = b - a3 * 10;
		b = a1 + a2 * 10 + a3 * 100 + a4 * 1000;
		if (a > 999)
		{
		if (b > 999)
		{
			System.out.printf("%d\n",b);
		}
		else if (b > 99)
		{
			System.out.printf("0%d\n",b);
		}
		else if (b > 9)
		{
			System.out.printf("00%d\n",b);
		}
		else
		{
			System.out.printf("000%d\n",b);
		}
		}
		else if (a > 99)
		{
		b = b / 10;
		if (b > 99)
		{
			System.out.printf("%d\n",b);
		}
		else if (b > 9)
		{
			System.out.printf("0%d\n",b);
		}
		else
		{
			System.out.printf("00%d\n",b);
		}
		}
		else if (a > 9)
		{
		b = b / 100;
		if (b > 9)
		{
			System.out.printf("%d\n",b);
		}
		else
		{
			System.out.printf("0%d\n",b);
		}
		}
		else
		{
			b = b / 1000;
			System.out.printf("%d\n",b);
		}
		return 0;
	}


}

