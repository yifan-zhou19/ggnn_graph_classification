package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int zhuan1(String c)
	{
		int i;
		int j = 0;
		for (i = 0;i < c.length();i++)
		{
			if (!c[i].equals(','))
			{
				a[j] = a[j] * 10 + c[i] - '0';
			}
			else
			{
				j = j + 1;
			}
		}
		return (j + 1);
	}
	public static int zhuan2(String c)
	{
		int i;
		int j = 0;
		for (i = 0;i < c.length();i++)
		{
			if (!c[i].equals(','))
			{
				b[j] = b[j] * 10 + c[i] - '0';
			}
			else
			{
				j = j + 1;
			}
		}
		return (j + 1);
	}
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int max = 0;
		int[] g = new int[1000];
		int gmax = 0;
		String c = new String(new char[10000]);
		String d = new String(new char[10000]);
		c = new Scanner(System.in).nextLine();
		d = new Scanner(System.in).nextLine();
		m = zhuan1(c);
		n = zhuan2(d);
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < max;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i >= a[j] != 0 && i + 1 <= b[j])
				{
					g[i] = g[i] + 1;
				}
			}
		}
		for (i = 0;i < max;i++)
		{
			if (g[i] > gmax)
			{
				gmax = g[i];
			}
		}
		System.out.printf("%d %d",n,gmax);


	}
}
