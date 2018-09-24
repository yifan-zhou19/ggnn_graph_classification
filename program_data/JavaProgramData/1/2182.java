package <missing>;

public class GlobalMembers
{
	public static int fen(int m,int k)
	{
		int i;
		int t = 1;
		int n = 0;
		for (i = 2;i <= m;i++)
		{
		if (m % i == 0)
		{
			n++;
		}
		}
		if (n == 1 || m == 1)
		{
			return 1;
		}
		else
		{
		for (i = 2;i <= m;i++)
		{
			if (m % i == 0 && m / i >= i != 0 && i >= k)
			{
				k = i;
				t = t + fen(m / i, k);
			}
		}
		}
		return t;
	}
	public static int Main()
	{
		int fen = new int(int m,int k);
		int n;
		int i;
		int x;
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
				 x = Integer.parseInt(tempVar2);
			 }
			 System.out.printf("%d\n",fen(x, 1));
		}

	}


}

