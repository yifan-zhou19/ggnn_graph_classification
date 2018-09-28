package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int m;
	public static int n;
	public static int Main()
	{
		void getdata();
		void bubblesort(int a[],int b[]);
		void merge();
		void putdata();

		getdata();
		bubblesort(a, b);
		merge();
		putdata();

		return 0;
	}

	public static void getdata()
	{
		int i;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void bubblesort(int[] a, int[] b)
	{
		int i;
		int j;
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					a[j] = a[j] ^ a[j + 1];
					a[j + 1] = a[j] ^ a[j + 1];
					a[j] = a[j] ^ a[j + 1];
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					b[j] = b[j] ^ b[j + 1];
					b[j + 1] = b[j] ^ b[j + 1];
					b[j] = b[j] ^ b[j + 1];
				}
			}
		}
	}

	public static void merge()
	{
		int i;
		for (i = 0;i < n;i++)
		{
			a[i + m] = b[i];
		}
	}

	public static void putdata()
	{
		int i;
		System.out.print(a[0]);
		for (i = 1;i < m + n;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
	}
}

