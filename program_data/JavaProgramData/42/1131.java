package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int[] a = new int[200000];
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		x = n;
		while (i <= x - 1)
		{
			if (a[i] == k)
			{
				for (j = i; j <= x - 1; j++)
				{
					a[j] = a[j + 1];
				}
				i--;
				x--;
			}
			i++;
		}
		if (a[x] == k)
		{
			for (i = 1; i <= x - 1; i++)
			{
			if (i != x - 1)
			{
			System.out.print(a[i]);
			System.out.print(' ');
			}
			else
			{
				System.out.print(a[i]);
			}
			}
		}
		else
		{
			for (i = 1; i <= x; i++)
			{
			if (i != x)
			{
			System.out.print(a[i]);
			System.out.print(' ');
			}
			else
			{
				System.out.print(a[i]);
			}
			}
		}
		return 0;
	}
}

