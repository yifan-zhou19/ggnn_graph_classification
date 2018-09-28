package <missing>;

public class GlobalMembers
{
	public static int su(int z)
	{
		   int i = 2;
		   int t = 0;
		   int k = Math.sqrt(z);
		   for (i = 2;i <= k;i++)
		   {
			  if (z % i == 0)
			  {
			  break;
			  }
		   }
			if (i > k)
			{
				t = 1;
			}
			return t;
	}
	public static int Main()
	{
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
			  for (i = 3;i <= m / 2;i++)
			  {
				   j = m - i;
				 if (su(i) != 0 && su(j) != 0)
				 {
					 System.out.printf("%d %d\n",i,j);
				 }
			  }
		  return 0;
	}

}

