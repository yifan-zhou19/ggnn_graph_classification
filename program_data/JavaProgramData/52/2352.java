package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int i;
		int o;
		int e;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		o = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		   sz[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int j;
		for (j = n - 1;j >= 0;j--)
		{
		   sz[j + o] = sz[j];
		}
		int k;
		for (k = 0;k < o;k++)
		{
		   sz[k] = sz[k + n];
		}
		for (e = 0;e < n - 1;e++)
		{
		System.out.print(sz[e]);
		System.out.print(" ");
		}
		System.out.print(sz[n - 1]);

		return 0;
	}


}

