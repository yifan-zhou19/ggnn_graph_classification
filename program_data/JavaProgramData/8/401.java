package <missing>;

public class GlobalMembers
{
	public static void fuction1(int x, int[] a)
	{
		int i;
		int j;
		int m;
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < x - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
	public static void fuction2(int y, int[] b)
	{
		int i;
		int j;
		int m;
		for (i = 0;i < y;i++)
		{
			for (j = 0;j < y - i - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					m = b[j];
					b[j] = b[j + 1];
					b[j + 1] = m;
				}
			}
		}
		for (i = 0;i < y - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(" ");
		}
		System.out.print(b[y - 1]);
	}
	public static int Main()
	{
		int k;
		int l;
		int p;
		int q;
		int[] a = new int[1000000];
		int[] b = new int[1000000];
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < p;k++)
		{
			a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (k = 0;k < q;k++)
		{
			b[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		fuction1(p, a);
		fuction2(q, b);
		return 0;
	}

}

