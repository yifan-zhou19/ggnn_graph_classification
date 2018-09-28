package <missing>;

public class GlobalMembers
{
	public static void print(int[] a, int m, int k, int n)
	{


			if (a[m] + 3 * m < 60)
			{
				if (k != n)
				{
					System.out.print((60 - 3 * m));
					System.out.print("\n");
				}
				else
				{
					System.out.print((60 - 3 * m));
				}
			}
			else if (a[m] + 3 * m >= 60 && a[m] + 3 * m <= 62)
			{
				if (k != n)
				{
					System.out.print(a[m]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(a[m]);
				}
			}

			else
			{
			   print(a, m - 1, k, n);
			}
	}
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int m;
		int j;
		int i = 1;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= n)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k++;
			if (m == 0)
			{
				if (k != n)
				{
					System.out.print(60);
					System.out.print("\n");
				}
				else
				{
					System.out.print(60);
				}
				i++;

			continue;
			}

			for (j = 1;j <= m;j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			print(a, m, k, n);
			i++;
		}
	  return 0;
	}





}

