package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int n_a;
	public static int n_b;
	public static void input()
	{
		int i;
		n_a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n_b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n_a;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n_b;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort()
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n_a - 1;i++)
		{
			for (j = i + 1;j < n_a;j++)
			{
				if (a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = 0;i < n_b - 1;i++)
		{
			for (j = i + 1;j < n_b;j++)
			{
				if (b[i] > b[j])
				{
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
	}
	public static void output()
	{
		int i;
		for (i = 0;i < n_a;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		for (i = 0;i < n_b;i++)
		{
			System.out.print(b[i]);
			if (i < n_b - 1)
			{
				System.out.print(" ");
			}
		}
	}
	public static int Main()
	{
		input();
		sort();
		output();
		return 0;
	}


}

