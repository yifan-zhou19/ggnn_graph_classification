package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[101];
		int n;
		int m;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1;j <= m;j++)
		{
			for (i = n;i >= 1;i--)
			{
				x[i] = x[i - 1];
			}
			x[0] = x[n];
		}

		for (i = 0;i < n;i++)
		{
			if (i != (n - 1))
			{
				System.out.print(x[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(x[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}





}

