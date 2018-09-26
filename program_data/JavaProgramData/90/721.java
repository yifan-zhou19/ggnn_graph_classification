package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??: ?????                     **
	//*?????? 1100013012              **
	//*???2011.11.16                     **
	//****************************************
	public static int num = 0;

	public static int apple(int m, int n)
	{
		if (n == 1 || m == 0)
		{
			return 1;
		}
		if (m < n)
		{
			return apple(m, m);
		}
		else
		{
			return apple(m, n - 1) + apple(m - n, n);
		}
	}

	public static int Main()
	{
		int t;
		int k;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0 ; k < t ; k++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(apple(m, n));
			System.out.print("\n");
		}
		return 0;
	}

}

