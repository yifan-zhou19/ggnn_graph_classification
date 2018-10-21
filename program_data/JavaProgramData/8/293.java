package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[100];
	public static int n;
	public static int m;
	public static int i;
	public static int j;
	public static int k;

	public static void get_array()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < m; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort_array()
	{
		int temp = 0;
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - 1 - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < m - 1; i++)
		{
			for (j = 0; j < m - 1 - i; j++)
			{
				if (b[j] > b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}

	}
	public static void combine_array()
	{
		for (i = 0; i < n; i++)
		{
			c[i] = a[i];
		}
		for (i = 0; i < m; i++)
		{
			c[i + n] = b[i];
		}
	}
	public static void print_array()
	{
		System.out.print(c[0]);
		for (i = 1; i < m + n; i++)
		{
			System.out.print(' ');
			System.out.print(c[i]);
		}
		System.out.print("\n");

	}

	public static int Main()
	{
		get_array();

		sort_array();

		combine_array();

		print_array();

		return 0;
	}
}

