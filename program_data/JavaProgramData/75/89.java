package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] a = new int[1000];
		int i;
		int j;
		int n = 0;
		char ch1;
		char ch2;
		for (i = 0; ; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch1 = System.in.read();
			n++;
			if (ch1 == '\n')
			{
				break;
			}
		}
		for (i = 0; ; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch2 = System.in.read();
			if (ch2 == '\n')
			{
				break;
			}
		}
		int min;
		min = x[0];
		for (i = 0; i < n; i++)
		{
			if (x[i] < min)
			{
				min = x[i];
			}
		}
			int max;
			max = y[0];
			for (i = 0; i < n; i++)
			{
				if (y[i] > max)
				{
					max = y[i];
				}
			}
				for (j = min; j <= max; j++)
				{
					for (i = 0; i < n; i++)
					{
						if (x[i] <= j != 0 && y[i] > j)
						{
							a[j]++;
						}
					}
				}
						int m;
						m = a[min];
						for (i = min; i < max; i++)
						{
							if (a[i] > m)
							{
								m = a[i];
							}
						}
							System.out.print(n);
							System.out.print(" ");
							System.out.print(m);
							System.out.print("\n");

							return 0;
	}


}

