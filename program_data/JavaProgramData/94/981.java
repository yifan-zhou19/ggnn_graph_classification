package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[500];
		int[] b = new int[500];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < N;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int t = 0;
		for (int j = 0;j < N;j++)
		{
			if (a[j] % 2 != 0)
			{
				t++;
				b[t] = a[j];

			}
		} //?????????b[500]?
		int p;
		int q;
		int w;
		for (q = 1;q < t - 1;q++)
		{
			for (p = 1;p < t + 1 - q;p++)
			{
				if (b[p] > b[p + 1])
				{
					w = b[p];
					b[p] = b[p + 1];
					b[p + 1] = w;
				}
			}
		} //?????????????
		for (int l = 1;l < t;l++)
		{
			System.out.print(b[l]);
			System.out.print(",");
		}
		System.out.print(b[t]);
		return 0;
	}

}

