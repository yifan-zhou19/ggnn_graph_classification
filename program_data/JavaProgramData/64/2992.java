public class dist
{
	   public int x;
	   public int y;
	   public int z;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  dist[] a = tangible.Arrays.initializeWithDefaultdistInstances(11);
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  int j;
		  int k;
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i].x = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  a[i].y = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  a[i].z = Integer.parseInt(tempVar4);
		  }
		  }
		  float[][] d = new float[10][10];
		  for (i = 1;i <= n - 1;i++)
		  {
		  for (j = 0;j < i;j++)
		  {
						  d[i][j] = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y) + (a[i].z - a[j].z) * (a[i].z - a[j].z));
		  }
		  }
		  float t;
		  int fx1;
		  int fx2;
		  int fy1;
		  int fy2;
		  int fz1;
		  int fz2;
		  int i0;
		  int j0;
		  k = n * (n - 1) / 2;
		  while (k != 0)
		  {
			  t = 0.0F;
		  for (i = 0;i < n;i++)
		  {
		  for (j = 0;j < i;j++)
		  {
						  if (d[i][j] > t)
						  {
							 t = d[i][j];
							 i0 = i;
							 j0 = j;
						   fx1 = a[j].x;
						   fy1 = a[j].y;
						   fz1 = a[j].z;
						   fx2 = a[i].x;
						   fy2 = a[i].y;
						   fz2 = a[i].z;
						  }
		  }
		  }
						  d[i0][j0] = 0F;
						  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",fx1,fy1,fz1,fx2,fy2,fz2,t);
						  k--;
		  }
						  System.in.read();
						  System.in.read();
	}
}

