package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  float[] a = new float[n];
		  float[] b = new float[n];
		  float[] d = new float[10000];
		  float max = 0F;
		  for (int i = 0;i < 10000;i++)
		  {
			d[i] = 0F;
		  }
		  for (int i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i] = Float.parseFloat(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  b[i] = Float.parseFloat(tempVar3);
				  }
		  }
		  for (int i = 0;i < n;i++)
		  {
			for (int j = 0;j < n;j++)
			{
					d[k] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
					k++;
			}
		  }
		  for (int i = 0;i < k;i++)
		  {
				  if (d[i] > max)
				  {
					max = d[i];
				  }
		  }
		  System.out.printf("%.4f",max);
	}
}

