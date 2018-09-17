package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int p;
		int q;
		int k = 0;
		p = 0;
		q = 0;
		int c = 1;
		int d = 1;
		int[] a = new int[11];
		int[] b = new int[11];
		int[] f = new int[11];
		for (i = 1;i <= 10;i++)
		{
				c = c * 2;
			if (c > x)
			{
					p = i;
					break;
			}
		}
		for (i = 1;i <= 10;i++)
		{
			d = d * 2;
			if (d > y)
			{
					q = i;
					break;
			}
		}
		for (i = 0;i <= p;i++)
		{
			a[i] = x;
			x = x / 2;
		}
		for (i = 0;i <= q;i++)
		{
			b[i] = y;
			y = y / 2;
		}
		for (i = 0;i <= p;i++)
		{
			for (j = 0;j <= q;j++)
			{

				if (a[i] == b[j] && a[i] != 0)
				{
						f[k] = a[i];
						k++;
				}
			}
		}
	System.out.print(f[0]);
	System.out.print("\n");


		return 0;
	}

}

