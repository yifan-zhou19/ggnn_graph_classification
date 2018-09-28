package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 6;p <= n;p = p + 2)
		{
		  for (i = 3;j = p - i;i = i + 2)
		  {
			k = Math.sqrt(j);
			for (t = 3;t <= k;t++)
			{
				if (j % t == 0)
				{
					break;
				}
			}
			if (t > k)
			{
			q = p - j;
			  k = Math.sqrt(q);
			for (t = 3;t <= k;t++)
			{
				if (q % t == 0)
				{
					break;
				}
			}
			if (t > k)
			{
				System.out.printf("%d=%d+%d\n",p,i,j);
				break;
			}
			}
		  }
		}
	}
}

