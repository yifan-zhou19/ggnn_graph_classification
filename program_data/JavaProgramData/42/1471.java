package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j = 0;
		int m = 0;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			if (a[i] != k)
			{
				m = m + 1;
			}
		}
		i = 0;
		do
		{
			if (a[i] != k)
			{
			j = j + 1;
			if (j < m)
			{
			System.out.print(a[i]);
			System.out.print(" ");
			}
			else
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
			}
			i++;
		} while (i <= n - 1);

		return 0;
	}
}

