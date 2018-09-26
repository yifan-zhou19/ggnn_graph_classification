package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int t;
		int p;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (p <= 140 && p >= 90 && q >= 60 && q <= 90)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
		}
		else
		{
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 1;j <= n;j++)
		{
			if (a[j - 1] <= 140 && a[j - 1] >= 90 && b[j - 1] >= 60 && b[j - 1] <= 90)
			{
				c[j] = c[j - 1] + 1;
			}
		}
		for (int k = 0;k < n;k++)
		{
			if (c[k + 1] < c[k])
			{
				t = c[k + 1];
				c[k + 1] = c[k];
				c[k] = t;
			}
		}
		System.out.print(c[n]);
		System.out.print("\n");
		return 0;
		}
	}


}

