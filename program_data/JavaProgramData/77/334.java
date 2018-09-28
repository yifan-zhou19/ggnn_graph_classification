package <missing>;

public class GlobalMembers
{
	public static void move(String c, int[] a, int pos, int n)
	{
		int i;
		for (i = pos;i < n - 2;i++)
		{
			c[i] = c[i + 2];
			a[i] = a[i + 2];
		}
	}
	public static void f(String c, int n, int[] a)
	{
		int i = 0;
		for (i = 0;i < n;i++)
		{
			if (c[i].equals(c[0]) && c[i + 1].equals(c[n - 1]))
			{
				System.out.print(a[i]);
				System.out.print(' ');
				System.out.print(a[i + 1]);
				System.out.print("\n");
				move(c, a, i, n);
				f(c, n - 2, a);
				break;
			}
		}
	}
	public static int Main()
	{
		String c = new String(new char[100]);
		int i;
		int n;
		int[] a = new int[100];
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = c.length();
		for (i = 0;i < n;i++)
		{
			a[i] = i;
		}
		f(c, n, a);
		return 0;
	}

}

