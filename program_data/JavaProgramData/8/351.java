package <missing>;

public class GlobalMembers
{
	public static int m = 0;
	public static int n = 0;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static void got()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		for (i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void f(int[] a, int[] b)
	{
		int i = 0;
		int j = 0;
		int temp = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
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
	public static void plus(int[] a, int[] b)
	{
		for (int i = 0;i < n;i++)
		{
			a[m + i] = b[i];
		}
	}
	public static void shu(int[] a)
	{
		for (int i = 0;i < m + n;i++)
		{
			if (i == m + n - 1)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
		}
	}
	public static int Main()
	{
		got();
		f(a, b);
		for (int i = 0;i < m;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		for (int i = 0;i < n;i++)
		{
			if (i != n - 1)
			{
				System.out.print(b[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(b[i]);
			}
		}

		return 0;
	}
}

