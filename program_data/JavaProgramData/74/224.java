package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int r;
		int s;
		r = Math.sqrt(x);
		for (s = 2;s <= r;s++)
		{
			if (x % s == 0)
			{
				break;
			}
		}
		if (s > r)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int huiwen(int y)
	{
		int k;
		int e = y;
		for (k = 0;e != 0;)
		{
			k = e % 10 + k * 10;
			e = e / 10;
		}
		if (k == y)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int a;
		int b;
		int c;
		int[] d = new int[300];
		int i;
		int j;
		for (i = 0;i < 300;i++)
		{
			d[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		j = 0;
		for (a = m;a <= n;a++)
		{
			b = 0;
			c = 0;
			if (sushu(a) != 0)
			{
				b = 1;
			}
			if (huiwen(a) != 0)
			{
				c = 1;
			}
			if ((b == 1) && (c == 1))
			{
				d[j] = a;
				j++;
			}
		}
		if ((j == 0) && (d[0] == 0))
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < j - 1;i++)
			{
				System.out.printf("%d,",d[i]);
			}
			System.out.printf("%d\n",d[j - 1]);
		}
	}


}

