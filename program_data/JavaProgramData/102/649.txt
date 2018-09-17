package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int k;
		int q;
		int p;
		double[] sg = new double[100];
		double e;
		double[] nan = new double[100];
		double[] nv = new double[100];
		char[][] xb = new char[100][100];
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
			   xb[i] = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   sg[i] = Double.parseDouble(tempVar3);
		   }
		   p = String.valueOf(xb[i]).length();
		   if (p == 4)
		   {
			   nan[a] = sg[i];
			   a = a + 1;
		   }
		   if (p == 6)
		   {
			   nv[b] = sg[i];
			   b = b + 1;
		   }
		}
		for (k = 1;k < a;k++)
		{
			for (q = 0;q < a - k;q++)
			{
				if (nan[q] < nan[q + 1])
				{
					e = nan[q + 1];
					nan[q + 1] = nan[q];
					nan[q] = e;
				}
			}
		}
		k = 1;
		q = 0;
		for (k = 1;k < b;k++)
		{
			for (q = 0;q < b - k;q++)
			{
				if (nv[q] < nv[q + 1])
				{
					e = nv[q + 1];
					nv[q + 1] = nv[q];
					nv[q] = e;
				}
			}
		}
		for (int r = 0;r < a;r++)
		{
			System.out.printf("%.2lf ",nan[a - r - 1]);
		}
		for (int t = 0;t < b;t++)
		{
			if (t < b - 1)
			{
			  System.out.printf("%.2lf ",nv[t]);
			}
			else
			{
						System.out.printf("%.2lf",nv[t]);
			}
		}
		return 0;
	}

}

