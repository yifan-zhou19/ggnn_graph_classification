package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[6][1];
		int i;
		int[] c = new int[6];
		int reverse = new int(int x,int z);
		for (i = 0;i <= 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i <= 5;i++)
		{
			c[i] = reverse(a[i][0], i);
		}
		for (i = 0;i <= 4;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
		System.out.printf("%d",c[5]);

	}

	public static int reverse(int x,int z)
	{
		int[][] b = new int[6][100];
		int m;
		int j;
		int f;
		int c;
		int d;
		int e;
		int y = 0;
		if (x == 0)
		{
			y = 0;
		}
		else if (x > 0)
		{
			m = Math.log10(x);
			for (j = m;j >= 0;j--)
			{
			f = Math.pow(10,j + 1);
			c = Math.pow(10,j);
			d = x % f - x % c;
			e = d / c;
			b[z][j] = e;
			}
			for (j = 0;j <= m;j++)
			{
			  y = y + b[z][j] * Math.pow(10,m - j);
			}
		}
		else if (x < 0)
		{
			x = (0 - x);
			m = Math.log10(x);
			for (j = m;j >= 0;j--)
			{
			f = Math.pow(10,j + 1);
			c = Math.pow(10,j);
			d = x % f - x % c;
			e = d / c;
			b[z][j] = e;
			}
			for (j = 0;j <= m;j++)
			{
				y = y + b[z][j] * Math.pow(10,m - j);
			}
			y = (0 - y);
		}
		return (y);
	}


}

