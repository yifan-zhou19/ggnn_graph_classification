package <missing>;

public class GlobalMembers
{
	public static void read(int n, int[] a) //??
	{
		int i = 0;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static int paixu(int[] a, int n) //??
	{
		int i;
		int j;
		int t;
		for (j = n - 2;j >= 0;j--)
		{
			for (i = 0;i <= j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;

				}
			}
		}
		return a;
	}
	public static void mix(int[] a, int[] b, int[] c, int e, int d) //??
	{
		int i = 0;
		int t;
		for (i = 0;i < e;i++)
		{
			c[i] = a[i];
		}
		for (i = 0;i < d;i++)
		{
			c[i + e] = b[i];
		}

	}
	public static void out(int[] c, int e, int d) //??
	{
		int i = 0;
		for (i = 0;i < e + d - 1;i++)
		{
			System.out.print(c[i]);
			System.out.print(" ");
		}
		System.out.print(c[e + d - 1]);
	}
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[300];
		int i = 0;
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		read(x, a);
		read(y, b);
		paixu(a, x);
		paixu(b, y);
		mix(a, b, c, x, y);
		out(c, x, y);
		return 0;
	}



}

