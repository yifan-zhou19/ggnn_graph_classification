package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int i;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[200];
	public static void in() //??
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;++i)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void sort() //??
	{
		sort(a[0],a[0] + m);
		sort(b[0],b[0] + n);
	}
	public static void add() //??
	{
		for (i = 0;i < m;++i)
		{
			c[i] = a[i];
		}
		for (i = m;i < m + n;++i)
		{
			c[i] = b[i - m];
		}
	}
	public static void out() //??
	{
		System.out.print(c[0]);
		for (i = 1;i < m + n;++i)
		{
			System.out.print(" ");
			System.out.print(c[i]);
		}
	}
	public static int Main()
	{
		in();
		sort();
		add();
		out();
		return 0;
	}


}

