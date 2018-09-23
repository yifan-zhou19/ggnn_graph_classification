package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int b;
		int c;
		int d;
		int i;
		int t;
		int j;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 0 && n < 10000)
		{
			for (i = 4;i >= 1;i--)
			{
			b = n % (int)Math.pow(10.0,(double)i) / (int)Math.pow(10.0,(double)(t = i - 1));
			if (b != 0)
			{
				j = i;
				break;
			}
			}
		for (i = 1;i <= j;i++)
		{
			d = n % (int)Math.pow(10.0,(double)i) / (int)Math.pow(10.0,(double)(t = i - 1));
			System.out.printf("%d",d);
		}
		}
		else if (n == 0)
		{
			System.out.print("0");
		}
			else if (n == 10000)
			{
				System.out.print("00001");
			}
	}

}

