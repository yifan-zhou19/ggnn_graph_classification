package <missing>;

public class GlobalMembers
{
	//********************************
	//*??  ???????      *****
	//*????? 1300012753     ***** 
	//*???2013.11.19          *****   
	//********************************
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] ans = new int[200];
	public static void read(int[] a, int[] b)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= m; i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1; i <= n; i++)
		{
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort(int[] a, int m)
	{
		int temp;
		for (int i = 1; i < m; i++)
		{
			for (int j = i + 1; j <= m; j++)
			{
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public static void add(int[] a, int[] b)
	{
		for (int i = 1; i <= m; i++)
		{
		ans[i] = a[i];
		}
		for (int i = 1; i <= n; i++)
		{
		ans[m + i] = b[i];
		}
	}
	public static void out(int[] a, int m)
	{
		System.out.print(a[1]);
		for (int i = 2; i <= m; i++)
		{
		System.out.print(' ');
		System.out.print(a[i]);
		}
	}
	public static int Main()
	{
		read(a, b);
		sort(a, m);
		sort(b, n);
		add(a, b);
		out(ans, m + n);
		return 0;
	}
}

