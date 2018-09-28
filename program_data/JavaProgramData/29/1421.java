package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  int[] n = new int[m];
		  int i;
		  for (i = 0;i < m;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  n[i] = Integer.parseInt(tempVar2);
						  }
		  }
		  for (i = 0;i < m;i++)
		  {
						  int xi;
						  xi = n[i];
						  if (xi == 1)
						  {
						  System.out.print("2.000\n");
						  }
						  if (xi == 2)
						  {
						  System.out.print("3.500\n");
						  }
						  if (xi > 2)
						  {
						  float[] ai = new float[xi];
						  float[] bi = new float[xi];
						  float[] ci = new float[xi];
						  int j;
						  ai[0] = 2F;
						  ai[1] = 3F;
						  bi[0] = 1F;
						  bi[1] = 2F;
						  float sumi;
						  sumi = 3.5F;
						  for (j = 2;j < xi;j++)
						  {
										   ai[j] = ai[j - 1] + ai[j - 2];
										   bi[j] = bi[j - 1] + bi[j - 2];
										   ci[j] = ai[j] / bi[j];
										   sumi += ci[j];
						  }
						  System.out.printf("%.3f\n",sumi);
						  }
		  }
	}
}

