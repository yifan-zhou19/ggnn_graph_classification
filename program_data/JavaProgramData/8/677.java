package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static void temp()
	{
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
	public static void temp1()
	{
		int x;
		for (i = 0;i < m - 1;i++)
		{
		for (j = 0;j < m - i - 1;j++)
		{
			if (a[j] > a[j + 1])
			{
				x = a[j];
				a[j] = a[j + 1];
				a[j + 1] = x;
			}
		}
		}
	}
	public static void temp2()
	{
		int x;
		for (i = 0;i < n - 1;i++)
		{
		for (j = 0;j < n - i - 1;j++)
		{
			if (b[j] > b[j + 1])
			{
				x = b[j];
				b[j] = b[j + 1];
				b[j + 1] = x;
			}
		}
		}
	}
	public static void temp3()
	{
		for (i = 0;i < m;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(" ");
		}
		System.out.print(b[n - 1]);
	}
	public static int Main()
	{
		temp();
		temp1();
		temp2();
		temp3();
		return 0;
	}



}

