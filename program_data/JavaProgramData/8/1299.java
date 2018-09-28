package <missing>;

public class GlobalMembers
{
	public static int na;
	public static int nb;
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int[] c = new int[10000];
	public static void f1()
	{
		na = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		nb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= na - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i <= nb - 1;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void f2()
	{
		sort(a,a + na);
		sort(b,b + nb);
	}
	public static void f3()
	{
		for (int i = 0;i <= na - 1;i++)
		{
			c[i] = a[i];
		}
		for (int i = na;i <= na + nb - 1;i++)
		{
			c[i] = b[i - na];
		}
	}
	public static void f4()
	{
		System.out.print(c[0]);
		for (int i = 1;i <= na + nb - 1;i++)
		{
			System.out.print(' ');
			System.out.print(c[i]);
		}
	}
	public static int Main()
	{
		f1();
		f2();
		f3();
		f4();
		return 0;
	}
}

