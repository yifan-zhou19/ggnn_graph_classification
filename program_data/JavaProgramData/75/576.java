package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1010];
		int[] b = new int[1010];
		int[] d = new int[1010];
		int i = 1;
		int n;
		char c = ',';
		for (i = 1; i <= 1010; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		n = i;
		b[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 2; j <= n; j++)
		{
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 1; j <= 1010; j++)
		{
			d[j] = 0;
			for (int k = 1; k <= n; k++)
			{
				if (a[k] <= j != 0 && b[k] > j)
				{
					d[j]++;
				}
			}
		}
		int max = d[1];
		for (int j = 2; j <= 1010; j++)
		{
			max = max >= d[j] != 0? max: d[j];
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

