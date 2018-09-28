package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int[] a = new int[100002];
		int g = 0;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			while (a[i] == k)
			{
				for (t = i; t <= n; t++)
				{
					a[t] = a[t + 1];
				}
				g++;
			}
		}
		for (i = 0; i < (n - g); i++)
		{
			if (i != (n - g - 1))
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

