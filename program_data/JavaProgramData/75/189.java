package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		int i = 1;
		int j;
		int t;
		int[] r = new int[1001];
		int max;
		int maxy;
		char c = ',';
		for (;;)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
			i++;
		}
		i = 1;
		for (;;)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
			i++;
		}
		maxy = 0;
		for (j = 1;j <= i;j++)
		{
			if (y[j] > maxy)
			{
				maxy = y[j];
			}
		}
		max = 0;
		for (t = 0;t <= maxy;t++)
		{
			for (j = 1;j <= i;j++)
			{
				if ((x[j] <= t) && (t < y[j]))
				{
					r[t]++;
				}

			}
			//cout<<t<<' '<<r[t]<<endl;

			if (max < r[t])
			{
				max = r[t];
			}
		}

		System.out.print(i);
		System.out.print(' ');
		System.out.print(max);


		return 0;
	}
}

