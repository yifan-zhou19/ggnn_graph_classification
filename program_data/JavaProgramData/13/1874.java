package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int i;
		int j;
		int n;
		int r = 0;
		int s = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = n - 1; i > 0; i--)
		{
		for (j = i - 1; j >= 0; j--)
		{
			if (a[i] == a[j])
			{
				a[i] = -1;
				r++;
			}
		}
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] != -1)
			{
				if (s != n - r - 1)
				{
					System.out.print(a[i]);
					System.out.print(" ");
					s++;
				}
				else
				{
					System.out.print(a[i]);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}

