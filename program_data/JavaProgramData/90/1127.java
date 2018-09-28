package <missing>;

public class GlobalMembers
{
	//************************************
	//*  ?????                      *
	//*  ??????                    *
	//*  ?????2011?11?24?        *
	//************************************


	public static int apple(int m, int n) //??????
	{
		if (n == 1 || m == 0) //?????1???????,???1
		{
			return 1;
		}
		else if (n > m) //??????????
		{
			return apple(m, m); //??????????
		}
		return (apple(m - n, n) + apple(m, n - 1)); //???????
	}

	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		int k;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= t; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = apple(m, n); //??????
			System.out.print(k);
			System.out.print("\n");
		}
		return 0;
	}

}

