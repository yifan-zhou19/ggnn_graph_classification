package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static void change(int[] a)
	{
		int t;
		int i;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int first = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		change(a);
		for (i = 0;i < n;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		n = m;
		change(b);
		for (i = 0;i < m;i++)
		{
			if (first == 1)
			{
				System.out.print(" ");
				System.out.print(b[i]);
			}
			if (first == 0)
			{
				System.out.print(b[i]);
			first = 1;
			}
		}
		System.out.print("\n");
		return 0;
	}

}

