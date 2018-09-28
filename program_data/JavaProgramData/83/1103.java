package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int k;
	   int sum1 = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[n];
	   int[] b = new int[n];
	   float[] c = new float[n];
	   float[] d = new float[n];
	   float sum2 = 0F;
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   sum1 += a[i];
	   }
	   for (j = 0;j < n;j++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b[j] = Integer.parseInt(tempVar3);
		   }
	   }
	   for (k = 0;k < n;k++)
	   {
		  if (b[k] >= 90 && b[k] <= 100)
		  {
			  c[k] = 4.0F;
		  }
		  else if (b[k] >= 85 && b[k] <= 89)
		  {
			  c[k] = 3.7F;
		  }
		  else if (b[k] >= 82 && b[k] <= 84)
		  {
			  c[k] = 3.3F;
		  }
		  else if (b[k] >= 78 && b[k] <= 81)
		  {
			  c[k] = 3.0F;
		  }
		  else if (b[k] >= 75 && b[k] <= 77)
		  {
			  c[k] = 2.7F;
		  }
		  else if (b[k] >= 72 && b[k] <= 74)
		  {
			  c[k] = 2.3F;
		  }
		  else if (b[k] >= 68 && b[k] <= 71)
		  {
			  c[k] = 2.0F;
		  }
		  else if (b[k] >= 64 && b[k] <= 67)
		  {
			  c[k] = 1.5F;
		  }
		  else if (b[k] >= 60 && b[k] <= 63)
		  {
			  c[k] = 1.0F;
		  }
		  else
		  {
			  c[k] = 0F;
		  }
		   d[k] = a[k] * c[k];
		  sum2 += d[k];
	   }
	   System.out.printf("%.2f",sum2 / sum1);
	   return 0;
	}

}

