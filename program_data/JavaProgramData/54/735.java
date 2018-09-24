package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int mm;
		int nn;
		int ll;
		int jj;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		l = n - 1;
		while (true)
		{
		  l = l + 1;
		  m = 0;
		  mm = l;
		  nn = n;
		  ll = 0;
		  jj = 0;
		  while (true)
		  {
				if (nn == 0)
				{
				   m = 1;
				   break;
				}
				ll = mm % n;
				if (ll != k)
				{
					break;
				}
				jj = mm / n * (n - 1);
				if (jj <= 0)
				{
					break;
				}
				mm = jj;
				nn = nn - 1;
		  }
		  if (m == 1)
		  {
			  break;
		  }
		}
		System.out.printf("%ld",l);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
	}


}

