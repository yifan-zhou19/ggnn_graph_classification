package <missing>;

public class GlobalMembers
{
	//********************************
	//*???1.cpp   **
	//*????????   **
	//*?????? 1300012838 **
	//*???2013.12.4  **
	//********************************

	public static int apple(int i, int n, int k, int s)
	{
		int m;
		if (i == 0)
		{
			return s;
		}
		else
		{
			m = apple(i - 1, n, k, s);
			if (m % (n - 1) != 0 || m == 0)
			{
				return 0;
			}
			return n * m / (n - 1) + k;
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int k;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = n - 1;
		do
		{
			m = apple(n, n, k, s);
			s += n - 1;
		} while (m <= k);
		System.out.print(m);
		System.out.print("\n");

		return 0;
	}

}

