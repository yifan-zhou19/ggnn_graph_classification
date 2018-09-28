package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int al = 0;
	public static int bl = 0;
	public static int i;
	public static int j;
	public static int k;
	public static void f1()
	{
		al = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		bl = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < al;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < bl;i++)
	{
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	public static void f2()
	{
		for (i = 0;i < al - 1;i++)
		{
		for (j = i;j < al;j++)
		{
		if (a[i] > a[j])
		{
			k = a[i];
			a[i] = a[j];
			a[j] = k;
		}
		}
		}
	for (i = 0;i < bl - 1;i++)
	{
		for (j = i;j < bl;j++)
		{
		if (b[i] > b[j])
		{
			k = b[i];
			b[i] = b[j];
			b[j] = k;
		}
		}
	}
	}
	public static void f3()
	{
		for (i = 0;i < bl;i++)
		{
		a[i + al] = b[i];
		}
	}
	public static void f4()
	{
		for (i = 0;i < al + bl - 1;i++)
		{
		System.out.print(a[i]);
		System.out.print(" ");
		}
	System.out.print(a[al + bl - 1]);
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

