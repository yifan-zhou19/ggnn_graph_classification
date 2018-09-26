package <missing>;

public class GlobalMembers
{
	public static int po(int x,int y)
	{
		int i;
		int z = 1;
		for (i = 1;i <= y;i++)
		{
			z *= x;
		}
		return z;
	}
	public static int r(int n)
	{
		int i;
		int j;
		int[] m = new int[20];
		int p = 0;
		int k;
		int l;
		if (n >= 0)
		{
			for (i = 1;n > 0;i++)
			{
				m[i] = n % 10;
				n /= 10;
			}
			for (j = 1;j <= i - 1;j++)
			{
				p += m[j] * po(10, i - j - 1);
			}
		}
		if (n < 0)
		{
			n = -n;
			for (i = 1;n > 0;i++)
			{
				m[i] = n % 10;
				n /= 10;
			}
			for (j = 1;j <= i - 1;j++)
			{
				p += m[j] * po(10, i - j - 1);
			}
			p = -p;
		}
		return p;
	}
	public static int Main()
	{
		int r = int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(r(a));
		System.out.print("\n");
		System.out.print(r(b));
		System.out.print("\n");
		System.out.print(r(c));
		System.out.print("\n");
		System.out.print(r(d));
		System.out.print("\n");
		System.out.print(r(e));
		System.out.print("\n");
		System.out.print(r(f));
		System.out.print("\n");
		return 0;
	}

}

