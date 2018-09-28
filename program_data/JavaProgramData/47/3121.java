package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			b[i] = i;
			a[b[i]] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= n / 2; i++)
		{
			m = b[i];
			b[i] = b[n + 1 - i];
			b[n + 1 - i] = m;
		}
		for (int j = 1; j <= n; j++)
		{
			if (j == n)
			{
				System.out.print(a[b[j]]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(a[b[j]]);
				System.out.print(" ");
			}
		}
		return 0;
	}
}

