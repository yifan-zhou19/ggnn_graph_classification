package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int de = new int(int m,int t);
		int m;
		int t;
		int total;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = Integer.parseInt(tempVar2);
		}
		total = de(m, t);
		System.out.printf("%d\n",total);
	}

	public static int de(int x,int y)
	{
		int i;
		int j;
		int p;
		int q;
		for (i = 1;;i++)
		{
					 p = 0;
					 q = i;
					 for (j = 1;j <= x;j++)
					 {
									  if (q % x == y)
									  {
												q = q - q % x - q / x;
												p++;
									  }
									  if (q % x != y)
									  {
									  break;
									  }
					 }
					 if (p == x && q > 0)
					 {
						 break;
					 }
		}
		return (i);
	}



}

