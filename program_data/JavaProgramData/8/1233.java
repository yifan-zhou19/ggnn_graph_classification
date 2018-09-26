package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : shj.cpp
	// Author      : ???
	// Time        : 2013.11.27
	// Description : ????????????????????????
	//============================================================================
	public static int[] x = new int[1000];
	public static int[] y = new int[1000];
	public static int[] z = new int[2000];
	public static int i;
	public static int j;
	public static int n;
	public static int m;
	public static int ex;
	public static void read()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m;i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void paixu()
	{ //?????
		for (i = 0;i < n;i++) //?????
		{
			for (j = 0;j < n - 1;j++)
			{
				if (x[j + 1] < x[j])
				{
					ex = x[j];
					x[j] = x[j + 1];
					x[j + 1] = ex;
				}
			}
		}
		for (i = 0;i < m;i++) //?????
		{
				for (j = 0;j < m - 1;j++)
				{
					if (y[j] > y[j + 1])
					{
						ex = y[j];
						y[j] = y[j + 1];
						y[j + 1] = ex;
					}
				}
		}
	}
	public static void heping()
	{
		for (i = 0;i < n;i++)
		{
			z[i] = x[i]; //??x[]????z[]
		}
		for (i = 0;i < m;i++)
		{
			z[n + i] = y[i]; //??y[]????z[]
		}
	}
	public static void display()
	{
		for (i = 0;i < n + m;i++)
		{ //????
			if (i == 0)
			{
				System.out.print(z[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(z[i]);
			}
		}
	}
	public static int Main()
	{
		read(); //????
		paixu();
		heping();
		display();
		return 0;
	}
}

