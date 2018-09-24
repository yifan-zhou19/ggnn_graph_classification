package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int[] c = new int[1000];
	public static float[] sum = new float[1000];
	public static float[] dis = new float[1000];
	public static int[] x = new int[1000];
	public static int[] y = new int[1000];
	public static int Main()
	{
	  int n = 0;
	  int d = 0;
	  int i = 0;
	  int r = 0;
	  int l = 0;
	  int f = 0;
	  int k = 0;
	  float e = 0F;
	  for (i = 0;i < n;i++)
	  {
		sum[i] = 0F;
		dis[i] = 0F;
	  }
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
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  c[i] = Integer.parseInt(tempVar4);
		  }
	  }
	  for (i = 0;i < n - 1;i++)
	  {
		  for (r = i + 1;r < n;r++)
		  {
			  sum[l] = (a[i] - a[r]) * (a[i] - a[r]) + (b[i] - b[r]) * (b[i] - b[r]) + (c[i] - c[r]) * (c[i] - c[r]);
			  dis[l] = Math.sqrt(sum[l]);
			  x[l] = i;
			  y[l] = r;
			  l++;
		  }
	  }
	  for (f = 0;f < n * (n - 1) / 2;f++)
	  {
		for (d = 0;d < n * (n - 1) / 2 - 1; d++)
		{
				if (dis[d] < dis[d + 1])
				{
					e = dis[d];
					dis[d] = dis[d + 1];
					dis[d + 1] = e;
									k = x[d];
									x[d] = x[d + 1];
									x[d + 1] = k;
									k = y[d];
									y[d] = y[d + 1];
									y[d + 1] = k;
				}
		}
	  }
	  for (f = 0;f < n * (n - 1) / 2;f++)
	  {
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[x[f]],b[x[f]],c[x[f]],a[y[f]],b[y[f]],c[y[f]],dis[f]);
	  }
	return 0;
	}
}

