package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[251];
	public static int[] b = new int[251];
	public static int[] c = new int[251];
	public static int al;
	public static int bl;
	public static int cl;
	public static int i;
	public static void sr()
	{
		int s;
		for (s = 0;s <= 250;s++)
		{
			a[s] = b[s] = c[s] = 0;
		}
		for (al = 0;(a[al] = (System.in.read() - '0')) != ('\n'-'0');al++)
		{
		}
		a[al] = 0;
		for (bl = 0;(b[bl] = (System.in.read() - '0')) != ('\n'-'0');bl++)
		{
		}
		b[bl] = 0;
	}
	public static void addit()
	{
		int k;
		for (cl = 1;(cl <= al) || (cl <= bl);cl++)
		{
			k = c[cl - 1];
			if (cl <= al)
			{
				k += a[al - cl];
			}
			if (cl <= bl)
			{
				k += b[bl - cl];
			}
			if (k > 9)
			{
				k -= 10;
				c[cl]++;
			}
			c[cl - 1] = k;
		}
	}
	public static void sc()
	{
		int sign = 0;
		int m;
		cl--;
		for (m = 0;m <= 250;m++)
		{
			if (c[250 - m] != 0)
			{
				cl = 251 - m;
				break;
			}
		}
		for (m = 0;m < cl;m++)
		{
			System.out.print(c[cl - m - 1]);
		}
	}
	public static int Main()
	{
		sr();
		addit();
			sc();

		return 0;
	}

}
