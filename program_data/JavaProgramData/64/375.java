package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] syz = new int[10][3];
	int i;
	int j;
	int n;
	int d;
	int y;
	int k;
	int r = 0;
	double result;
	double[] sy = new double[45];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < 3;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				syz[i][j] = Integer.parseInt(tempVar2);
			}
		}
	}
	for (i = 0;i < n - 1;i++)
	{
		 for (k = i + 1;k < n;k++)
		 {
		result = Math.sqrt(1.0 * (syz[k][0] - syz[i][0]) * (syz[k][0] - syz[i][0]) + 1.0 * (syz[k][1] - syz[i][1]) * (syz[k][1] - syz[i][1]) + 1.0 * (syz[k][2] - syz[i][2]) * (syz[k][2] - syz[i][2]));
		 sy[r] = result;
		   r++;
		 }
	}
	  /*
	  ?????sy???double???????e????double?? 
	      int e;
	      */
		  double e;
	   for (d = 1;d <= n * (n - 1) / 2;d++)
	   {
		 for (y = 0;y < n * (n - 1) / 2 - d;y++)
		 {
			   if (sy[y] <= sy[y + 1])
			   {
				e = sy[y];
				sy[y] = sy[y + 1];
				sy[y + 1] = e;
			   }
		 }
	   }
		  /* 
	for(i=1,k=1;j<n*(n-1)/2;i++)
	??????????i?????? 
	*/
	for (i = 1,k = 1;i < n * (n - 1) / 2;i++)
	{
	   for (j = 0;j < k;j++)
	   {
	  /*
	  ????????==????????????? 
	      if(sy[i]==sy[j])
	  */
		if (Math.abs(sy[i] - sy[j]) < 0.000001)
		{
		  break;
		}
	   }
		if (j == k)
		{
		sy[k] = sy[i];
		 k++;
		}
	}
	  /*
	  ???k???????????????? 
	for(y=0;y<k;y++)
	*/
	int kk = k;
	for (y = 0;y < kk;y++)
	{
		  for (i = 0;i < n - 1;i++)
		  {
			for (k = i + 1;k < n;k++)
			{
			  /*
			  ????????????????????                
			  if(sqrt(1.0*(syz[k][0]-syz[i][0])*(syz[k][0]-syz[i][0])+1.0*(syz[k][1]-syz[i][1])*(syz[k][1]-syz[i][1])+1.0*(syz[k][2]-syz[i][2])*(syz[k][2]-syz[i][2]))==sy[y])
			  */
			  if (Math.abs(Math.sqrt(1.0 * (syz[k][0] - syz[i][0]) * (syz[k][0] - syz[i][0]) + 1.0 * (syz[k][1] - syz[i][1]) * (syz[k][1] - syz[i][1]) + 1.0 * (syz[k][2] - syz[i][2]) * (syz[k][2] - syz[i][2])) - sy[y]) < 0.00001)
			  {
			  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",syz[i][0],syz[i][1],syz[i][2],syz[k][0],syz[k][1],syz[k][2],sy[y]);
			  }
			}
		  }
	}

	return 0;
	}

}

