package <missing>;

public class GlobalMembers
{
	//**************************************
	//*  ????2.cpp                     *
	//*  ??????                      *
	//*  ?????2013?11?27?          *
	//*  ????????                  *
	//**************************************
	public static int f(int x,int y)
	{
		if (y == 1)
		{
			return 1;
		}
		if (x == 1)
		{
			return 1;
		}
		else
		{
		if (x <= y)
		{
			return f(x, x - 1) + 1;
		}
		else
		{
			return f(x, y - 1) + f(x - y, y);
		}
		}
	}
	public static int Main()
	{
		int t;
		int i;
		int[] a = new int[30];
		int[] b = new int[30];
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a[i], b[i]));
			System.out.print("\n");
		}
		return 0;
	}

}

