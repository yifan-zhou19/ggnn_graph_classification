package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n - p;i++)
		{
			if (a[i] == k)
			{
				for (j = i;j < n - p - 1;j++)
				{
					a[j] = a[j + 1];
				}
				p++;
				i--;
				if (j < n - 1)
				{
					continue;
				}
			}
		}
		for (i = 0;i < n - p - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n - p - 1]);
		return 0;
	}
}

