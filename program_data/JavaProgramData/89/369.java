package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int[] b = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int t = 0;t < n;t++)
		{
			a[t] = 0;
			b[t] = 0;
		}
		int i;
		int j;
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				a[i]++;
				b[j]++;
			}
		}
		for (int r = 0;r < n;r++)
		{
			if (a[r] == 0 && b[r] == n - 1)
			{
				System.out.print(r);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

