package <missing>;

public class GlobalMembers
{
	//****************************
	//*?????? 1300012809  **
	//*???2013-12-4          **
	//*????????         **
	//****************************
	public static int m = 0; //????
	public static int k;
	public static int i;
	public static int j;
	public static int n;
	public static abstract int f(int x), panduan; //????????
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = k;
		while (m == 0) //?while??????????????
		{
			j = j + n; //???????m?????n
			m = f(n);
			if (panduan != 0) //panduan???
			{
				m = 0;
			}
			panduan = 0;
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}
	public static int f(int x) //????
	{
		int y;
		if (x == 1) //n == 1???????????????
		{
			return j;
		}
		else
		{
			y = f(x - 1);
			if (y % (n - 1) != 0) //?????????????????????
			{
				panduan = 1;
				return 0;
			}
			else
			{
				return y * n / (n - 1) + k; //???
			}
		}


	}
}

