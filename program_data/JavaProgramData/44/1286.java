package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int a;
		int x;
		int y;
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x = Integer.parseInt(tempVar);
			}
			if (x == 0 || x == -0)
			{
				System.out.print("0\n");
			}
			else if (x < 0)
			{
			x = -x;
			y = -1 * reverse(x);
			System.out.printf("%d\n",y);
			}
			else if (x > 0)
			{
			y = reverse(x);
			System.out.printf("%d\n",y);
			}
		}
	return 0;
	}
	public static int reverse(int a)
	{
	int i;
	int j;
	int n;
	int m;
	int[] sz = new int[50];
	int b;
	int c;
	int d;
	for (n = 0;;n++)
	{
		if (Math.pow(10,n) <= a != 0 && a < Math.pow(10,n + 1))
		{
		break;
		}
	}
	n = n + 1;
	sz[0] = a % 10;
	b = 0;
	for (m = 1;m < n;m++)
	{
		b = b + sz[m - 1] * Math.pow(10,m - 1);
		d = Math.pow(10,m);
		sz[m] = ((a - b) / d) % 10;
	}
	c = 0;
	for (j = 0;j < n;j++)
	{
		c = c + Math.pow(10,j) * sz[n - j - 1];
	}
	return (c);
	}
}

