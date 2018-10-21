package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int most;
		int[] a = new int[25];
		int[] f = new int[25];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < k ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		f[0] = 1;
		for (int i = 1; i < k; i++)
		{
			most = 0;
			for (int j = 0; j < i; j++)
			{
				if (a[j] >= a[i])
				{
					if (f[j] > most)
					{
						most = f[j];
					}
				}
			}
			f[i] = most + 1;
		}
		most = 0;
		for (int i = 0; i < k; i++)
		{
			if (f[i] > most)
			{
				most = f[i];
			}
		}
		System.out.print(most);
		System.out.print("\n");
		return 0;
	}
}

