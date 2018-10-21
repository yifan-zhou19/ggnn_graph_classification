package <missing>;

public class GlobalMembers
{
	// ywxTest.cpp : ??????????????
	//********************************
	//*???1.????? **
	//*?????? 1300017623 **
	//*???2013.12.4  **
	//********************************
	public static int f(int n, int k, int m, int t) //??m??????
	{
		if (t == 1) //?????
		{
			if (((m - k) % n == 0) && (m - k) >= n) //?????????1???
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
		if (((m - k) % n == 0) && (m - k) >= n) //?????????1???
		{
			return f(n, k, m - k - (m - k) / n, t - 1); //?????????m-k-(m-k)/n???
		}
		else
		{
			return 1;
		}
	}

	public static int Main()
	{
		int n;
		int k;
		int m = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (f(n, k, m, n) != 0) //?m????
		{
			m++;
		}
		System.out.print(m);

		return 0;
	}
}

