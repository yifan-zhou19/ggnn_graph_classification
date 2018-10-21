package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int i;
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - m;i++)
		{
			b[m + i] = a[i];
		}
		for (i = n - m;i < n;i++)
		{
			b[i - n + m] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.print(b[i]);
				System.out.print("\n");
			}
			else
			{
			System.out.print(b[i]);
			System.out.print(" ");
			}
		}
		return 0;
	}

}

