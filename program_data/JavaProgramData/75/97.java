package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int n = 0;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int k;
		int m;
		int j;
		int t = 0;
		char b;
		char c;
		for (n = 0; ; n++)
		{
			x[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(b);
			if (b == '\n')
			{
				break;
			}
		}
		for (n = 0; ; n++)
		{
			y[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(c);
			if (c == '\n')
			{
				break;
			}
		}
		for (k = 0; k <= n; k++)
		{
			for (j = x[k]; j < y[k]; j++)
			{
				a[j]++;
			}
		}
		for (m = 0; m < 1000; m++)
		{
			if (t < a[m])
			{
				t = a[m];
			}
		}
		System.out.print(n + 1);
		System.out.print(" ");
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}
}

