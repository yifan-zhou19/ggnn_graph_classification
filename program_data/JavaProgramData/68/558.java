package <missing>;

public class GlobalMembers
{
	public static int P(int x)
	{
		int b = 1;
		for (int i = 2;i <= Math.sqrt(x);i++)
		{
		b *= (x % i != 0);
		}
		if (b == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}

	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
				for (a = 2;a <= i / 2;a++)
				{
						b = i - a;
						if ((P(a) == 1) && (P(b) == 1))
						{
								System.out.printf("%d=%d+%d\n",i,a,b);
								break;
						}

				}
		}

	}
}

