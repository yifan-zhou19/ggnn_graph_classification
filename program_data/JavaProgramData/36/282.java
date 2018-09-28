package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		char c;
		int i;
		int j;
		int m;
		int n;
		int t;
		int x;
		for (i = 0;(c = System.in.read()) != ' ';i++)
		{
			a[i] = c;
		}
		for (j = 0;(c = System.in.read()) != '\n';j++)
		{
			b[j] = c;
		}
		if (i != j)
		{
			System.out.print("NO");
		}
		else
		{
			for (n = 0;n < (i - 1);n++)
			{
				if (a[n + 1] < a[n])
				{
					t = a[n];
					a[n] = a[n + 1];
					a[n + 1] = t;
					if (n != 0)
					{
					n = n - 2;
					}
				}
			}
			for (m = 0;m < (i - 1);m++)
			{
				if (b[m + 1] < b[m])
				{
					t = b[m];
					b[m] = b[m + 1];
					b[m + 1] = t;
					if (m != 0)
					{
					m = m - 2;
					}
				}
			}

			for (x = 0;x < i;x++)
			{
				if (a[x] != b[x])
				{
					break;
				}
			}
				if (x != i)
				{
					System.out.print("NO");
				}
				else if (x == i && a[i - 1] != b[i - 1])
				{
					System.out.print("NO");
				}
				else if (x == i && a[i - 1] == b[i - 1])
				{
					System.out.print("YES");
				}
		}

		return 0;

	}

}
