package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  float[] a = new float[15];
	  float[] b = new float[15];
	  float GPA;
	  float sum = 0F;
	  for (k = 0;k < n;k++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[k] = Float.parseFloat(tempVar2);
	  }
	  }
	  for (k = 0;k < n;k++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[k] = Float.parseFloat(tempVar3);
	  }
	  }
	  for (k = 0;k < n;k++)
	  {
	  if (b[k] >= 90F)
	  {
		  b[k] = 4F;
	  }
	  else if (b[k] >= 85F)
	  {
		  b[k] = 3.7F;
	  }
	  else if (b[k] >= 82F)
	  {
		  b[k] = 3.3F;
	  }
	  else if (b[k] >= 78F)
	  {
		  b[k] = 3.0F;
	  }
	  else if (b[k] >= 75F)
	  {
		  b[k] = 2.7F;
	  }
	  else if (b[k] >= 72F)
	  {
		  b[k] = 2.3F;
	  }
	  else if (b[k] >= 68F)
	  {
		  b[k] = 2.0F;
	  }
	  else if (b[k] >= 64F)
	  {
		  b[k] = 1.5F;
	  }
	  else if (b[k] >= 60F)
	  {
		  b[k] = 1.0F;
	  }
	  else
	  {
		  b[k] = 0F;
	  }
	  }
	  for (k = 0;k < n;k++)
	  {
	  GPA = GPA + a[k] * b[k];
	  sum = sum + a[k];
	  }
	  System.out.printf("%.2f",GPA / sum);
	  return 0;
	}
}

