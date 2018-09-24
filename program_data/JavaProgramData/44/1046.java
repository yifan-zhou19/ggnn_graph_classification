package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int k;
		k = 0;
		while (num != 0)
		{
			  k = k * 10 + num % 10;
			  num = num / 10;
		}
		return k;
	}

	public static int Main()
	{
		int n;
		int b;
		int i;
		for (i = 1;i <= 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 0)
		{
			  b = 0 - reverse(0 - n);
			  System.out.printf("%d\n",b);
		}
		else if (n == 0)
		{
		System.out.print("0\n");
		}
		else
		{
			System.out.printf("%d\n",reverse(n));
		}
		}
		System.in.read();
		System.in.read();
	}

}

