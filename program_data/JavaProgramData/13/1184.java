package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[n + 1];
		x[0] = 0;
		for (i = 1;i <= n;i++)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x[i] = a;
		}
		int j;
		for (j = n;j > 1;j--)
		{
			int k;
			for (k = 1;k < j;k++)
			{
				if (x[k] == x[j])
				{
							   x[j] = 0;
				}
			}
		}
		System.out.print(x[1]);
		for (i = 2;i <= n;i++)
		{
			if (x[i] != 0)
			{
						System.out.print(" ");
						System.out.print(x[i]);
			}
		}
		System.out.print("\n");

		return 0;
	}

}

