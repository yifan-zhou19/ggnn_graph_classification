package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int fenjie = new int(int m,int i);
		int n;
		int i;
		int[] c = new int[100];
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
				c[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",fenjie(c[i], 2));
		}


		return 0;
	}

	public static int fenjie(int m,int i)
	{
	 int l = 1;
	 int j;
	 int t = Math.sqrt((float)m);
	 for (j = i; j <= t; ++j)
	 {
	  if (m % j == 0)
	  {
	   l += fenjie(m / j, j);
	  }
	 }
	  return l;
	}
}

