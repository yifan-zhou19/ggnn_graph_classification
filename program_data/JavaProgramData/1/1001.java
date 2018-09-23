package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		void fen(int a[],int x);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		fen(a, n);
	}
	public static void fen(int[] a, int x)
	{
		int k;
		int b = 2;
		int c;
		int t;
		int look = new int(int x,int y);
		for (k = 0;k < x;k++)
		{
			c = a[k];
			t = look(c, b);
			System.out.printf("%d\n",t);
		}
	}
	public static int look(int x,int y)
	{
		int total = 1;
		int p;
		if (x / y == 0)
		{
			return 0;
		}
		else
		{
			for (p = y;p < x;p++)
			{
				if (x % p == 0)
				{
					total = total + look(x / p, p);
				}
			}
		}
		return total;
	}
}

