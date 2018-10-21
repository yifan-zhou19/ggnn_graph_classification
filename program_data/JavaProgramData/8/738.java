package <missing>;

public class GlobalMembers
{
	/*1200012866 ??? 11.16*/
	public static int[] a = new int[2000];
	public static int[] b = new int[1000];

	public static void read()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < x;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < y;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void paixu(int[] z)
	{
		int c;
		for (int i = 0;z[i + 2] != 0;i++)
		{
			for (int j = 0;z[j + 1] != 0;j++) //????????
			{
				if (z[j] > z[j + 1])
				{
					c = z[j];
					z[j] = z[j + 1];
					z[j + 1] = c;
				}
			}
		}
	}
	public static void addd(int[] x, int[] y)
	{
		int q = 0;
		while (x[q] != 0)
		{
			q++;
		}
		for (int z = 0;y[z] != 0;z++)
		{
			x[q + z] = y[z];
		}
	}
	public static void shuchu(int[] x)
	{
		for (int z = 0;x[z] != 0;z++)
		{
			if (z == 0)
			{
				System.out.print(x[z]);
			}
			else
			{
				System.out.print(' ');
				System.out.print(x[z]);
			}
		}
	}
	public static int Main()
	{
		read();
		paixu(a);
		paixu(b);
		addd(a, b);
		shuchu(a);
		return 0;
	}
}

