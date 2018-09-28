package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int[] sz = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18)
			{
				a = a + 1;
			}
		 else if (sz[i] > 18 && sz[i] <= 35)
		 {
			 b = b + 1;
		 }
		 else if (sz[i] > 35 && sz[i] <= 60)
		 {
			 c = c + 1;
		 }
		 else if (sz[i] > 60)
		 {
			 d = d + 1;
		 }
		}
		System.out.printf("1-18: %.2lf%%\n",100.0 * a / n);
		System.out.printf("19-35: %.2lf%%\n",100.0 * b / n);
		System.out.printf("36-60: %.2lf%%\n",100.0 * c / n);
		System.out.printf("Over60: %.2lf%%\n",100.0 * d / n);
		return 0;

	}


}

