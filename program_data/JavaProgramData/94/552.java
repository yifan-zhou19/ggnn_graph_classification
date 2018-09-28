package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int k = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
			int p = 0;
				for (i = 0;i < n;i++)
				{
					if (a[i] % 2 == 1)
					{
						b[p] = a[i];
						p++;
						k++;
					}
				}
				for (p = 0;p < k - 1;p++)
				{
					System.out.print(b[p]);
					System.out.print(",");
				}
				System.out.print(b[k - 1]);
				System.out.print("\n");
			return 0;
	}


}

