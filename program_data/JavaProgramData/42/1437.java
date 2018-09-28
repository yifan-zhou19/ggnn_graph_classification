package <missing>;

public class GlobalMembers
{
	//
	// ????2.cpp
	// ???????????
	// ?????? 1200012943
	// ??:2012.11.2
	//
	public static int Main()
	{
		int[] a = new int[100000];
		int k;
		int n;
		int j;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i < n)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		while (i < n)
		{
			if (a[i] == k)
			{
				if (i < n - 1)
				{
					j = i;
					while (j < n - 1)
					{
						a[j] = a[j + 1];
						j++;
					}
				}
					n--;
			}
			else
			{
				i++;
			}
		}
		for (j = 0; j < n; j++)
		{
			System.out.print(a[j]);
			if (j < n - 1)
			{
				System.out.print(' ');
			}
		}
		System.out.print("\n");
		return 0;
	}

}

