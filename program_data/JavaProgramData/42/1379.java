package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int m = 0;
		int h;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[110000];
		for (i = 1 ;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = n;j >= 1;j--)
		{
			if (a[j] == k)
			{
				for (l = j;l <= n;l++)
				{
					a[l] = a[l + 1];
				}
				m = m + 1;
			}
		}
		for (h = 1;h <= n - m;h++)
		{
			if (h == 1)
			{
				System.out.print(a[h]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[h]);
			}
		}
		return 0;
	}




}

