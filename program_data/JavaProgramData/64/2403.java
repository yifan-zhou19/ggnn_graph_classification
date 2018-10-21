package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	   int i;
	   int j;
	   int n;
	   int k;
	   int l;
	   int r;
	   int[] x = new int[10];
	   int[] y = new int[10];
	   int[] z = new int[10];
	   double[] s = {0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	   double e;


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
			x[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			z[i] = Integer.parseInt(tempVar4);
		}
	   }
	 l = 0;

		for (i = 0;i < n - 1;i++)
		{
		  for (k = i + 1;k < n;k++)
		  {
	   r = (x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]) + (z[i] - z[k]) * (z[i] - z[k]);
		   s[l] = Math.sqrt(1.0 * r);

	  l++;

		  }
		}
	  for (i = 1;i <= l;i++)
	  {
			for (j = 0;j <= l - i;j++)
			{
				 if (s[j] < s[j + 1])
				 {
		e = s[j + 1];
	s[j + 1] = s[j];
	s[j] = e;
				 }
			}
	  }

	 for (i = 0;i < n * (n - 1) / 2;i++)
	 {
		for (j = 0;j < n;j++)
		{
	  for (k = j + 1;k < n;k++)
	  {
		 r = (x[j] - x[k]) * (x[j] - x[k]) + (y[j] - y[k]) * (y[j] - y[k]) + (z[j] - z[k]) * (z[j] - z[k]);


		if (s[i] != s[i + 1])
		{
	 if (s[i] == Math.sqrt(1.0 * r))
	 {
	   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[j],y[j],z[j],x[k],y[k],z[k],s[i]);
	 }
		}
	   else
	   {
		   continue;
	   }
	  }
		}
	 }
	return 0;
	 }
}

