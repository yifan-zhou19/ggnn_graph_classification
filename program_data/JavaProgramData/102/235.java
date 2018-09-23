package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		float[] nan = new float[40];
		int m;
		int f;
		float[] nv = new float[40];
		String xingbie = new String(new char[7]);
		float shengao;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		f = 0;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xingbie = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shengao = Float.parseFloat(tempVar3);
			}

			if (xingbie.charAt(0) == 'm')
			{
				nan[m] = shengao;
			 m++;
			}
			else
			{
				nv[f] = shengao;
			 f++;
			}
		}
	float T;
	int j;
	int k;

	for (j = 0;j <= m - 2;j++)
	{
		for (k = 0;k <= m - 2 - j;k++)
		{
	  if (nan[k] > nan[k + 1])
	  {
		  T = nan[k + 1];
		  nan[k + 1] = nan[k];
		  nan[k] = T;
	  }
		}
	}
	   for (j = 0;j <= f - 2;j++)
	   {
		 for (k = 0;k <= f - 2 - j;k++)
		 {
	   if (nv[k] < nv[k + 1])
	   {
		  T = nv[k + 1];
		  nv[k + 1] = nv[k];
		  nv[k] = T;
	   }
		 }
	   }
	   for (i = 0;i < m;i++)
	   {
		  System.out.printf("%.2f ",nan[i]);
	   }
	 for (i = 0;i < f - 1;i++)
	 {
		System.out.printf("%.2f ",nv[i]);
	 }
	System.out.printf("%.2f",nv[f - 1]);
		return 0;
	}


}

