package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int i;
		int j;
		int k;
		float sum = 0.0F;
		float sum1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] n = new int[1000];
		float[] jg = new float[1000];

		for (i = 0;i < m;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 (n[i]) = Integer.parseInt(tempVar2);
			 }
		}

		 for (i = 0,j = 0;i < m,j < m;i++,j++)
		 {
			 float[] f = new float[100000];
			 f[0] = 1F;
			 f[1] = 2F;
			 for (k = 2;k <= n[i];k++)
			 {
				   f[k] = f[k - 1] + f[k - 2];
			 }
			 for (k = 1;k <= n[i];k++)
			 {
				   sum1 = f[k] / f[k - 1];
				   sum = sum + sum1;
			 }
			 jg[j] = sum;
			 sum = 0F;
		 }
		for (j = 0;j < m;j++)
		{
			  System.out.printf("%.3f\n",jg[j]);
		}


	}



}

