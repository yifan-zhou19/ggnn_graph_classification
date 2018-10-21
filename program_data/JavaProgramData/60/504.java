package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int prime = int x;
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 3;a < n - 1;a++)
		{
			b = a;
			c = a + 2;
			b = prime(b);
			c = prime(c);
			if (b == 0 || c == 0)
			{
			}
			else
			{
				System.out.printf("%d %d\n",b,c);
			}
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
	}

	public static int prime(int x)

	{
		int a;
		int b;
		b = x;
		for (a = 2;a < x;a++)
		{
			if (x % a == 0)
			{
				b = 0;
			}
		}
		return (b);
	}

}

