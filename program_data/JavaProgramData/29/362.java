package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   float[] a = new float[1000];
	   float[] b = new float[1000];
	   int n;
	   int m;
	   int i;
	   int j;
	   int k;
	   float sum;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   a[0] = 2F;
	   a[1] = 3F;
	   b[0] = 1F;
	   b[1] = 2F;
	   for (i = 0;i < n;i++)
	   {
		  sum = 0F;
		   //printf("%f",sum);
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		 //  for(j=0;j<2;j++)
		//   sum=sum+(float)(a[j])/(float)(b[j]);
		   for (j = 0;j < m;j++)
		   {
			  if (j >= 2)
			  {
			  a[j] = a[j - 1] + a[j - 2];
			  b[j] = b[j - 1] + b[j - 2];
			  }
			  sum = sum + (float)(a[j]) / (float)(b[j]);
		   }
		   System.out.printf("%.3f\n",sum);
	   }
	   System.in.read();
	   System.in.read();
	}

}

