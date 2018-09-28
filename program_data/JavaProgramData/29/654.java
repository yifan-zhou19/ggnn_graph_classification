package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int m;
		   int i;
		   int j;
		   int[] sz = new int[100];
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   m = Integer.parseInt(tempVar);
		   }
		   for (i = 0;i < m;i++)
		   {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 sz[i] = Integer.parseInt(tempVar2);
			 }
		   }
			 int[] sza = new int[100];
			 int[] szb = new int[100];
			 sza[0] = 1;
			  sza[1] = 2;
			  szb[0] = 2;
			   szb[1] = 3;
			   for (i = 2;i < 100;i++)
			   {
			   sza[i] = sza[i - 1] + sza[i - 2];
				szb[i] = szb[i - 1] + szb[i - 2];
			   }
				 float[] szc = new float[100];
				for (i = 0;i < 100;i++)
				{
				 szc[i] = (float)szb[i] / sza[i];
				}
				for (i = 0;i < m;i++)
				{
				  float sum = 0.000F;
				 for (j = 0;j < sz[i];j++)
				 {
				sum = sum + szc[j];
				 }
				System.out.printf("%.3f\n",sum);
				}
			  return 0;
	}

}

