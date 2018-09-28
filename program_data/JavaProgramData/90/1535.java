package <missing>;

public class GlobalMembers
{
	public static int fen(int m,int n)
	{
		if (n == 1 || m == 1)
		{
		return 1;
		}
		else if (n == 0 && m == 0)
		{
		return 1;
		}
		else if (m < 0)
		{
		return 0;
		}
		else
		{
		return fen(m, n - 1) + fen(m - n, n);
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",fen(m, n));
		}
	}



}

