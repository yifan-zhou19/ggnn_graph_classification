package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int cnt = 0;
		int t;
		int[] a = new int[100002];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		while (i < n)
		{
			if (a[i] == k) //????k??
			{
				cnt = cnt + 1;
				if (i == n - cnt)
				{
					break;
				}
				else
				{
					for (j = i + 1; j < n; j++)
					{
						a[j - 1] = a[j]; //?????????????
					}

				} //????k?????

			}
			else
			{
				i++;
			}

		}

		for (t = 0;t < (n - cnt - 1);t++)
		{
			System.out.print(a[t]);
			System.out.print(" ");
		}
		System.out.print(a[n - cnt - 1]);



		return 0;
	}

}

