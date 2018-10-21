package <missing>;

public class GlobalMembers
{
	public static int putapple(int p, int q)
	{
		if (((q <= 0) || (p < 0)) || ((q < 0) && (p == 0)))
		{
			return 0;
		}
		else
		{
		  if ((q == 1) || ((p == 0) && (q >= 0)))
		  {
			return 1;
		  }
		  else
		  {
			return putapple(p, q - 1) + putapple(p - q, q);
		  }
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int a;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",putapple(m, n));
		}
	}

}

