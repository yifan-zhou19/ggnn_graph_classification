package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int z;
		float[] a = new float[30];
		float[] b = new float[30];
		float sum;
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
				 z = Integer.parseInt(tempVar2);
			 }
			 a[0] = 2.0F;
			 b[0] = 1.0F;
			 sum = 0F;
			 for (j = 0;j < z;j++)
			 {
				 sum += (float)(a[j] / b[j]);

				 if (j == 0)
				 {
					 a[j + 1] = a[j] + 1;
					 b[j + 1] = b[j] + 1;
				 }
				 else
				 {
					 a[j + 1] = a[j] + a[j - 1];
					   b[j + 1] = b[j] + b[j - 1];
				 }
			 }
			 System.out.printf("%.3f\n",sum);
		}
		return 0;
	}

}

