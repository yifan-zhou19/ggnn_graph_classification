package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int i;
		int k;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			if (a[i] == k)
			{
				n -= 1;
				for (j = i; j < n; j++)
				{
					a[j] = a[j + 1];
				}
				i -= 1;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.print(a[i]);
		}
		return 0;
	}

}

