package <missing>;

public class GlobalMembers
{
	public static int even(int a)
	{
		int b;
		b = a / 2;
		return (b);
	}

	public static int odd(int a)
	{
		int b;
		b = a * 3 + 1;
		return (b);
	}

	public static void Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			System.out.print("End");
			return;
		}
		while (true)
		{
			if (n % 2 == 0)
			{
				m = even(n);
				System.out.printf("%d/2=%d\n",n,m);
				n = m;
				if (m == 1)
				{
					System.out.print("End");
					break;
				}
			}
			else
			{
				m = odd(n);
				System.out.printf("%d*3+1=%d\n",n,m);
				n = m;
				continue;
				if (m == 1)
				{
					System.out.print("End");
					break;
				}
			}
		}
	}
}

