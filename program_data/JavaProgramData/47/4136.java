package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[n + 1];
		for (i = n;i >= 1;i--)
		{
		x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i < n + 1;i++)
		{
			if (i == 1)
			{
			System.out.print(x[i]);
			}
			else
			{
			System.out.print(" ");
			System.out.print(x[i]);
			}
		}
		return 0;
	}
}

