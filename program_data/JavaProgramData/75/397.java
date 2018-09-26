package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10000];
		int[] y = new int[10000];
		int[] t = new int[1000];
		int i;
		int j;
		int k;
		int max;
		for (k = 0; ; k++)
		{
			x[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (k = 0; ; k++)
		{
			y[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (i = 0; i < 1000; i++)
		{
			for (j = 0; j < k + 1; j++)
			{
				if ((x[j] <= i) && (i < y[j]))
				{
					t[i]++;
				}
			}
		}
		max = 0;
		for (i = 1; i < 1000; i++)
		{
			if (t[max] < t[i])
			{
				max = i;
			}
		}
		System.out.print(k + 1);
		System.out.print(' ');
		System.out.print(t[max]);
		System.out.print("\n");
		return 0;
	}

}

