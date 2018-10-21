package <missing>;

public class GlobalMembers
{
	public static int up(int x)
	{
		if (x % 2 == 0)
		{
			return x / 2;
		}
		else
		{
			return (x - 1) / 2; //????????
		}
	}
	public static int Main()
	{
		int x1; //??????
		int y1;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[100];
		int[] y = new int[100];
		int m = 2; //x,y???
		int n = 2;
		x[1] = x1;
		y[1] = y1;
		if ((x1 == 1) || (y1 == 1))
		{
			System.out.print(1);
		}
		else
		{
			int g = 0; //????
			while (g == 0)
			{
				x[m] = up(x[m - 1]);
				if (x[m] == 1)
				{
					g = 1;
				}
				else
				{
					m++;
				}
			}
			int f = 0; //????
			while (f == 0)
			{
				y[n] = up(y[n - 1]);
				if (y[n] == 1)
				{
					f = 1;
				}
				else
				{
					n++;
				}
			}
			int h = 0; // ????
			while (h == 0)
			{
				if (x[m] == y[n])
				{
					m--;
					n--;
				}
				else
				{
					System.out.print(x[m + 1]);
					h = 1;
				}
			}



		}
		return 0;
	}

}

