public class equal
{
  public int i1;
  public int j1;
  public int k1;
  public int i2;
  public int j2;
  public int k2;
  public double distance;
}
public class node
{
public int i;
public int j;
public int k;
}

package <missing>;

public class GlobalMembers
{
	public static void bubblesort(equal[] d, int n)
	{
		int i;
		int j;
		int m;
		double t;
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
			   if (d[j].distance > d[j - 1].distance)
			   {
				 t = d[j].distance;
				 d[j].distance = d[j - 1].distance;
				 d[j - 1].distance = t;
				 m = d[j].i1;
				 d[j].i1 = d[j - 1].i1;
				 d[j - 1].i1 = m;
				 m = d[j].i2;
				 d[j].i2 = d[j - 1].i2;
				 d[j - 1].i2 = m;
				 m = d[j].j1;
				 d[j].j1 = d[j - 1].j1;
				 d[j - 1].j1 = m;
				 m = d[j].k1;
				 d[j].k1 = d[j - 1].k1;
				 d[j - 1].k1 = m;
				 m = d[j].j2;
				 d[j].j2 = d[j - 1].j2;
				 d[j - 1].j2 = m;
				 m = d[j].k2;
				 d[j].k2 = d[j - 1].k2;
				 d[j - 1].k2 = m;
			   }
			}
		}
	}
	public static int Main()
	{
	  int n;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  node[] aa = tangible.Arrays.initializeWithDefaultnodeInstances(n);
	  for (i = 0;i < n;i++)
	  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(aa[i].i) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(aa[i].j) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(aa[i].k) = Integer.parseInt(tempVar4);
			}
	  }
	  equal[] equal1 = tangible.Arrays.initializeWithDefaultequalInstances(1000);
	  int a;
	  int b;
	  int c;
	  int g;
	  int p = 0;
	  for (a = 0;a < n;a++)
	  {
		 for (b = a + 1;b < n;b++)
		 {
			 equal1[p].i1 = aa[a].i;
			 equal1[p].j1 = aa[a].j;
			 equal1[p].k1 = aa[a].k;
			 equal1[p].i2 = aa[b].i;
			 equal1[p].j2 = aa[b].j;
			 equal1[p].k2 = aa[b].k;
			 equal1[p].distance = Math.sqrt(Math.pow((double)(equal1[p].i1 - equal1[p].i2),2) + Math.pow((double)(equal1[p].j1 - equal1[p].j2),2) + Math.pow((double)(equal1[p].k1 - equal1[p].k2),2));
			  p++;
		 }
	  }
	  bubblesort(equal1, p);
	  for (g = 0;g < p;g++)
	  {
	  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",equal1[g].i1,equal1[g].j1,equal1[g].k1,equal1[g].i2,equal1[g].j2,equal1[g].k2,equal1[g].distance);
	  }
	  return 0;
	}



}

