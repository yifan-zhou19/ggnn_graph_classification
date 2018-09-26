package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  float[][] a = new float[3][11];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < 2;i++)
	  {
		  for (j = 0;j < n;j++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i][j] = Float.parseFloat(tempVar2);
			  }
		  }
	  }
	  float s1 = 0.0F;
	 for (int k = 0;k < n;k++)
	 {
		 if (a[1][k] >= 90F)
		 {
			 a[1][k] = 4.0 * a[0][k];
		 }
		 else if (a[1][k] >= 85F && a[1][k] <= 89F)
		 {
			 a[1][k] = 3.7 * a[0][k];
		 }
		 else if (a[1][k] >= 82F && a[1][k] <= 84F)
		 {
			 a[1][k] = 3.3 * a[0][k];
		 }
		 else if (a[1][k] >= 78F && a[1][k] <= 81F)
		 {
			 a[1][k] = 3.0 * a[0][k];
		 }
		 else if (a[1][k] >= 75F && a[1][k] <= 77F)
		 {
			 a[1][k] = 2.7 * a[0][k];
		 }
		 else if (a[1][k] >= 72F && a[1][k] <= 74F)
		 {
			 a[1][k] = 2.3 * a[0][k];
		 }
		 else if (a[1][k] >= 68F && a[1][k] <= 71F)
		 {
			 a[1][k] = 2.0 * a[0][k];
		 }
		 else if (a[1][k] >= 64F && a[1][k] <= 67F)
		 {
			 a[1][k] = 1.5 * a[0][k];
		 }
		 else if (a[1][k] >= 60F && a[1][k] <= 63F)
		 {
			 a[1][k] = 1.0 * a[0][k];
		 }
		 else
		 {
			 a[1][k] = 0F;
		 }
		 s1 += a[1][k];
	 }
	int s2 = 0;
	for (int p = 0;p < n;p++)
	{
	   s2 += a[0][p];
	}
	  float GPA;
	  GPA = s1 / s2;
	  System.out.printf("%.2f",GPA);
	  return 0;
	}
}

