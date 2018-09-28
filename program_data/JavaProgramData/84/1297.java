package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int max;
		int cmax;
		int[] sz = new int[100];
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
						 max = sz[0];
						 cmax = sz[1];
						 for (i = 2;i < n;i++)
						 {
										  if (sz[i] > max)
										  {
													   t = max;
													   max = sz[i];
													   cmax = t;
										  }
													   else if (sz[i] > cmax && sz[i] < max)
													   {
															 cmax = sz[i];
													   }
						 }
															 System.out.printf("%d\n%d\n",max,cmax);
															 return 0;
	}
}

