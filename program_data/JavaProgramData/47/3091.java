package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[100];
		int n;
		int i;
		int m;
		char c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = i;
		}
		for (i = 1 ; i <= m ; i++)
		{
			System.out.print(x[m + 1 - i]);
			if (m + 1 - i != 1)
			{
				System.out.print(" ");
			}
		}
	}
}

