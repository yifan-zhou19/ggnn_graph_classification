package <missing>;

public class GlobalMembers
{
	public static int zhi(int x)
	{
		int b = 1;
		int i = 1;
		for (i = 2;i <= x / 2;i++)
		{
		if (x % i == 0)
		{
			b = b + 1;
		}
		}
		return b;
	}
	public static int Main()
	{
		int i;
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= m / 2;i = i + 2)
		{
							 if (zhi(i) == 1 && zhi(m - i) == 1)
							 {
							 System.out.print(i);
							 System.out.print(' ');
							 System.out.print(m - i);
							 System.out.print("\n");
							 }
		}


		return 0;
	}

}

