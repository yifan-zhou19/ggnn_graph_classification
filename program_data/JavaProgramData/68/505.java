package <missing>;

public class GlobalMembers
{
	public static int primenumber(int n)
	{
	  int l;
	  int k;
	  k = (int)Math.sqrt(n);
	  for (l = 3;l <= k;l++)
	  {
		  if (n % l == 0)
		  {
		   return 0;
		  }

	  }
	  return 1;
	}
	public static int Main()
	{
		int m;
		int k;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		k = (int)Math.sqrt(m);
		for (i = 6;i <= m;i = i + 2)
		{
			for (b = 3;b <= i / 2; b = b + 2)
			{
				if (primenumber(b) != 0 && primenumber(i - b) != 0)
				{
					break;
				}
			}
			System.out.printf("%d=%d+%d\n",i,b,i - b);
		}

		return 0;
	}


}

