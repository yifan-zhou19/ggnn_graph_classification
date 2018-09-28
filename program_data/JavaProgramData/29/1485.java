package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int m;
		  int i;
		  int k;
		  float sum = 0F;
		  float[] a = new float[NUM];
		  float[] b = new float[NUM];
		  b[1] = 1F;
		  b[2] = 2F;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 m = Integer.parseInt(tempVar2);
				 }
				 for (k = 3;k <= m + 1;k++)
				 {
				 b[k] = b[k - 1] + b[k - 2];
				 }
				 for (k = 1;k <= m;k++)
				 {
				 a[k] = b[k + 1] / b[k];
				 }
				 for (k = 1;k <= m;k++)
				 {
				 sum = sum + a[k];
				 }
				 System.out.printf("%.3f\n",sum);
				 sum = 0F;
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

