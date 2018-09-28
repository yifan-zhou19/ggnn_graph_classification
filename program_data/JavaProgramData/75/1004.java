package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int[] x = new int[1001];
		int[] y = new int[1001];
		int[] sum = new int[1001];
		int i;
		int j;
		int n;
		int h;
		int m;
		int k;
		int max = 0;
		for (i = 0; ; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		for (j = 0; j <= i; j++)
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
		}
		for (k = 0; k < 1000; k++)
		{
			for (m = 0; m <= i; m++)
			{
				if (x[m] <= k != 0 && y[m] > k)
				{
					sum[k]++;
				}
			}
		}
		for (h = 0; h < 1000; h++)
		{
			if (sum[h] > max)
			{
				max = sum[h];
			}
		}
		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}



}

