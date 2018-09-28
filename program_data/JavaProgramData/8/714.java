package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void scan(); //??????
		scan();
		return 0;
	}
	public static void scan()
	{
		int m;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < m; i++) //??????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0; j < n; j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		void sort(int x, int c[]); //??????
		sort(m, a);
		System.out.print(" ");
		sort(n, b);
	}
	public static void sort(int x, int[] c) //???????????????????
	{
		for (int k = 0; k < x - 1; k++)
		{
			for (int l = 0; l < x - k - 1; l++)
			{
				if (c[l] > c[l + 1])
				{
					swap(c[l], c[l + 1]);
				}
			}
		}
		for (int h = 0; h < x - 1; h++)
		{
			System.out.print(c[h]);
			System.out.print(" ");
		}
		System.out.print(c[x - 1]);
	}
}

