package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int i = 0;
		int n = 0;
		int t = 0;
		int f = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((f != 0) && (a[t] == 0))
			{
				System.out.print(" ");
			}
			else
			{
				f = 1;
			}
			if (a[t] == 0)
			{
				System.out.print(t);
			}
			a[t] = 1;
		}
		return 0;
	}
}

