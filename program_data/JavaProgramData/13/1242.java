package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20000];
		for (i = 0; i <= n - 1; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j < i; j++)
			{
				if (a[j] == m)
				{
					break;
				}
			}
			if (j == i)
			{
				a[i] = m;
			}
			else
			{
				n = n - 1;
				i = i - 1;
			}
		}
		System.out.print(a[0]);
		for (i = 1; i <= n - 1; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}

		return 0;
	}
}

