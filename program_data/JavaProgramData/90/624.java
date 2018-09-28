package <missing>;

public class GlobalMembers
{
	public static int count = 0;

	public static int f(int m,int n)
	{
		int a = 0;
		int b = 0;
		if (m < n) //????????????
		{
			n = m; //??n-m??????????
		}
		if (m >= n) //???????????
		{
			if (m > 0) //???????0?
			{
				a = f(m - n, n); //???????
			}
			if (n > 1) //????1?
			{
				b = f(m, n - 1); //??????
			}
		}
		if (n == 1) //??1??????
		{
			return 1;
		}
		if (m == 0) //????????
		{
			return 1;
		}
		return (a + b);
	}


	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(m, n));
			System.out.print("\n");
		}
		return 0;
	}

}

