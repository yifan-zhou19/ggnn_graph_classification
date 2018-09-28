package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[500];
	public static int[] b = new int[200];
	public static int temp;
	public static void read() //??
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	public static void rank() //??
	{
		for (int i = 0;i < m - 1;i++)
		{
			for (int j = 0;j < m - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0;i < n - 1;i++)
		{
				for (int j = 0;j < n - i - 1;j++)
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

	public static void merge() //??
	{
		for (int i = 0;i < n;i++)
		{
			a[m + i] = b[i];
		}
	}

	public static void show() //??
	{
		for (int i = 0;i < m + n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[m + n - 1]);
	}

	public static int Main()
	{
		  read();
		  rank();
		  merge();
		  show();
		  return 0;
	}

}

