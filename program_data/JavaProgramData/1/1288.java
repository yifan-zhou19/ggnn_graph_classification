package <missing>;

public class GlobalMembers
{
	/*
	/???   10(1)
	/??     ???
	/??     2012?11?26?
	/???   ????
	*/
	public static int Main()
	{
		int fenjie = new int(int x, int y);
		int a;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(fenjie(a, 2));
	System.out.print("\n");
		}
		return 0;
	}
	public static int fenjie(int x, int y)
	{
		int b; // ?????????
		int i;
		int count = 1;
		if (x == 1)
		{
			return 0;
		}
		if (x == 2)
		{
			return 1;
		}
		b = Math.sqrt((double) x);
		for (i = y; i <= b; i++)
		{
			if (x % i == 0) // ?????????????????????count???
			{
				count += fenjie(x / i, i); // ????????????i??????????
			}
		}
		return count;
	}
}

