package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int r;
		int i;
		int p;
		int q;
		int[] high = new int[100];
		int[] low = new int[100];
		r = 0;
		q = 0;
		p = -1;
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
				   high[i] = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   low[i] = Integer.parseInt(tempVar3);
			   }
		}
		for (i = 0;i < n;i++)
		{
			   if (high[i] >= 90 && high[i] <= 140 && low[i] >= 60 && low[i] <= 90)
			   {
							 if (i - p == 1)
							 {
									  q = q + 1;
									  p = i;
							 }

			   }
			   else
			   {
					   if (r < q)
					   {
								r = q;
					   }
					   q = 0;
					   p = i;
			   }
			   if (i == n - 1)
			   {
								if (r < q)
								{
									r = q;
								}
			   }
		}
		System.out.printf("%d",r);
		return 0;
	}

}

