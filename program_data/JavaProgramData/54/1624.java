package <missing>;

public class GlobalMembers
{
	//******************* 
	//**?????*******
	//**???1300012728*
	//**2013.11.27*******
	//*******************
	public static int n;
	public static int k;
	public static int apple(int i)
	{
		if (i == n)
		{
			return n * j + k;
		}
		int m = apple(i + 1);
		if (m == 0)
		{
		return 0;
		}
		if (m % (n - 1) == 0)
		{
			return m / (n - 1) * n + k;
		}
		else
		{
			return 0;
		}
	}
	public static int j;
	public static int Main()
	{
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; ; j++)
		{
			a = apple(1);
			if (a != 0)
			{
				System.out.print(a);
				break;
			}
		}
		return 0;
	}

}

