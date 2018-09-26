package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a = 0;
		int n;
		int[] sz = new int[101];
		int b = 0;
		int c = 0;
		int d = 0;
		int zong = 0;
		double aa;
		double bb;
		double cc;
		double dd;
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
											  sz[i] = Integer.parseInt(tempVar2);
										  }
		}
						 for (i = 0;i < n;i++)
						 {
										  zong++;
										  if (sz[i] <= 18)
										  {
														a++;
										  }
										  else if (sz[i] > 18 && sz[i] < 36)
										  {
											   b++;
										  }
										  else if (sz[i] > 35 && sz[i] < 61)
										  {
											   c++;
										  }
										  else if (sz[i] > 60)
										  {
											   d++;
										  }
						 }
										  aa = 100.00 * a / zong;
										  bb = 100.00 * b / zong;
										  cc = 100.00 * c / zong;
										  dd = 100.00 * d / zong;
										  System.out.printf("1-18: %.2lf%%\n",aa);
										  System.out.printf("19-35: %.2lf%%\n",bb);
										  System.out.printf("36-60: %.2lf%%\n",cc);
										  System.out.printf("60??: %.2lf%%",dd);
										  return 0;
	}
}

