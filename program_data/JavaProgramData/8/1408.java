package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int x;
	public static int y;
	public static int i;
	public static int j;
	public static int k;
	public static void a1()
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < y;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void b1(int[] p, int n)
	{
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (p[j + 1] < p[j])
				{
					k = p[j];
					p[j] = p[j + 1];
					p[j + 1] = k;
				}
			}
		}
	}
	public static void c(int[] p1, int x, int[] p2, int y)
	{
		for (i = x,j = 0;i < x + y;j++,i++)
		{
			p1[i] = p2[j];
		}
	}
	public static void d(int x, int y)
	{
		System.out.print(a[0]);
		for (i = 1;i < x + y;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
	}


	public static int Main()
	{
		a1();
		b1(a, x);
		b1(b, y);
		c(a, x, b, y);
		d(x, y);
		return 0;
	}
}

