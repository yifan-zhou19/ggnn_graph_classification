package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n) //?????
	{
		if (m < n || m / n == 1) //?????????2?????0
		{
			return 0;
		}
		if ((m % n == 0) && m / n >= n) //?m???n??m/n?????n
		{
			return f(m / n, n) + f(m, n + 1) + 1;
		}
		else //??????
		{
			return f(m, n + 1);
		}

	}
	public static int Main()
	{
		int q;
		int i;
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= q;i++)
		{
		int p;
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(p, 2) + 1);
		System.out.print("\n");
		}
		return 0; //????
	}

}

