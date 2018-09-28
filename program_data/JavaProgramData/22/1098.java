package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] > a[i])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}

	public static int find(int[] a, int n)
	{
		int gole;
		int i;
		int max = a[0];
		if (n == 1)
		{
			return -1;
		}
		else if (a[0] == a[n - 1])
		{
			return -1;
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] < max)
				{
					break;
				}
			}
			return a[i];
		}
	}

	public static int Main()
	{
		int[] a = new int[310];
		int n = 0;
		int num = 0;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{
				a[n++] = num;
				num = 0;
			}
			else
			{
				num = num * 10 + c - '0';
			}
		}
		a[n++] = num;
		paixu(a, n);
		if (find(a, n) == -1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",find(a, n));
		}

		return 0;
	}




}
