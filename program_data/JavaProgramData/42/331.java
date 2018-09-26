package <missing>;

public class GlobalMembers
{
	/*
	 * ???2010?11?1?
	 * ?????
	 * ???????????
	 *
	 */
	public static int Main()
	{
		int n;
		int k;
		int i = 0;
		int j;
		int temp;
		int[] a = new int[100000];
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
				for (j = i + 1; j < n; j++)
				{
					if (a[j] != k)
					{
						temp = a[j];
						a[j] = a[i];
						a[i] = temp;

						break; //??k??????????????k?????
					}
				}
			}
		}
		if (a[0] != k)
		{
			System.out.print(a[0]);
		}
		for (i = 1; i < n; i++)
		{
			if (a[i] != k)
			{
				System.out.print(' ');
				System.out.print(a[i]);
			}

		}
		return 0;
	}




}

