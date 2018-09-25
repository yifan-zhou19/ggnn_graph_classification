package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		k = 0;
		m = 0;
		n = 0;
		if ((a % 3) == 0)
		{
			k = 1;
		}
		if ((a % 5) == 0)
		{
			m = 1;
		}
		if ((a % 7) == 0)
		{
			n = 1;
		}
		if ((k + m + n) == 3)
		{
			System.out.print("3 5 7\n");
		}
		if ((k + m + n) == 2)
		{
		if ((k == 1) && (m == 1))
		{
			System.out.print("3 5\n");
		}
		if ((k == 1) && (n == 1))
		{
			System.out.print("3 7\n");
		}
		if ((m == 1) && (n == 1))
		{
			System.out.print("5 7\n");
		}
		}
		if ((k + m + n) == 1)
		{
			if (k == 1)
			{
				System.out.print("3\n");
			}
			if (m == 1)
			{
				System.out.print("5\n");
			}
			if (n == 1)
			{
				System.out.print("7\n");
			}
		}
		if ((k + m + n) == 0)
		{
			System.out.print("n\n");
		}
		return 0;
	}
}

