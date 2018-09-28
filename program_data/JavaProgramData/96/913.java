package <missing>;

public class GlobalMembers
{
	public static int c;
	public static int d;
	public static void cal(int[] b, int i, int k, int n)
	{
		if (i < n)
		{
		c = (k * 10 + b[i]) / 13;
		k = (k * 10 + b[i]) % 13;
		if (i != 1)
		{
		System.out.print(c);
		}
		else
		{
			if (c > 0)
			{
				System.out.print(c);
			}
		}
		cal(b, i + 1, k, n);
		}
		if (i == n - 1)
		{
			System.out.print("\n");
			System.out.print(k);
		}
	}
	public static int Main()
	{
		String a = new String(new char[105]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j;
		int k;
		int m;
		int n;
		n = a.length();
		int[] b = new int[105];
		for (i = 0;i < n;i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		if (n == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(b[0]);
		}
		else
		{
			if (n == 2 && b[0] == 1 && b[1] < 3)
			{
				System.out.print("0");
				System.out.print("\n");
				System.out.print(10 + b[1]);
			}
			else
			{
			   cal(b, 1, b[0], n);
			}
		}

		return 0;
	}

}

