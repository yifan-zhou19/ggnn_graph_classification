package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	  int n;
	  int i;
	  int k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  float x;
	  float[] nu = new float[300];
	  float d = 0F;
	  float z = 0F;
	  float[] nn = new float[300];
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  nu[i] = Float.parseFloat(tempVar2);
	  }
	  z = z + nu[i];

	  }
	  x = z / (float)n;
	  for (i = 0;i < n;i++)
	  {
		if (x - nu[i] > d)
		{
			d = x - nu[i];
		}
		if (nu[i] - x > d)
		{
			d = nu[i] - x;
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		  if (x - nu[i] - d <= 0.01F && x - nu[i] - d >= -0.01F)
		  {
			  nn[k] = nu[i];
			  k++;
		  }
		  else
		  {
			  if (nu[i] - x - d <= 0.01F && nu[i] - x - d >= -0.01F)
			  {
				  nn[k] = nu[i];
			  k++;
			  }
		  }


	  }
	  System.out.printf("%.0f",nn[0]);
	  for (i = 1;i < k;i++)
	  {
	  System.out.printf(",%.0f",nn[i]);
	  }


	  return 0;
	}
}

