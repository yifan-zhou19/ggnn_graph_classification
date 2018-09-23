package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (a[j] != 0 && a[j] == a[i])
				{
					a[j] = 0;
				}
			}
		}

		for (k = 0; k < n; k++)
		{
			if (a[k] != 0)
			{
				System.out.print(a[k]);
				break;
			}
		}

		for (int i = k + 1; i < n; i++)
		{
			if (a[i] != 0)
			{
				System.out.print(' ');
				System.out.print(a[i]);
			}
		}

		return 0;
	}

}

