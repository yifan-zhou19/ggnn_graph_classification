package <missing>;

public class GlobalMembers
{
	/*
	 *?????????
	 *?????
	 *??: 2010-11-21
	 */

	public static int n; //a???????????????
	public static int k;
	public static int a;
	public static int i;
	public static int f(int x,int a,int k,int n)
	{ //f(x,a,k)???n+1-x??????????
		if (x == 1)
		{
			return n * a + k;
		}
		else
		{
			return f(x - 1, a, k, n) * n / (n - 1) + k;
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 1;;a++)
		{ //?a??
			for (i = 1;i < n;i++)
			{
				if (f(i, a, k, n) % (n - 1) != 0) //????????????????
				{
					break;
				}
			}
		if (i == n)
		{
			System.out.print(f(n, a, k, n));
			break;
		}
		}
		return 0;
	}
}

