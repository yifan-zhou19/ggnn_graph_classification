public class DOT
{
	   public int x;
	   public int y;
	   public int z;
}

package <missing>;

public class GlobalMembers
{
	public static DOT[] dot = tangible.Arrays.initializeWithDefaultDOTInstances(10);
	public static DOT temp = new DOT();
	public static int Main()
	{
		int i;
		int n;
		int j;
		int t;
		int p;
		int q;
		double[][] d = new double[10][10];
		double max;
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
							 dot[i].x = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 dot[i].y = Integer.parseInt(tempVar3);
						 }
						 String tempVar4 = ConsoleInput.scanfRead();
						 if (tempVar4 != null)
						 {
							 dot[i].z = Integer.parseInt(tempVar4);
						 }
		} //printf("%d %d %d\n",dot[0].x,dot[0].y,dot[0].z);
		for (i = 0;i < n - 1;i++)
		{
						   for (j = i + 1;j < n;j++)
						   {

											  d[i][j] = Math.sqrt((dot[i].x - dot[j].x) * (dot[i].x - dot[j].x) + (dot[i].y - dot[j].y) * (dot[i].y - dot[j].y) + (dot[i].z - dot[j].z) * (dot[i].z - dot[j].z));
						   }
		}
		for (t = 0;t < n * (n - 1) / 2;t++)
		{
			max = d[0][0];
		for (i = 0;i < n;i++)
		{
						 for (j = 0;j < n;j++)
						 {
										  if (d[i][j] > max)
										  {
											  max = d[i][j];
											  p = i;
											  q = j;
										  }
						 }
		} //printf("%.2f",max);
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",dot[p].x,dot[p].y,dot[p].z,dot[q].x,dot[q].y,dot[q].z,max);
		d[p][q] = 0;
		}
		return 0;
	}

}

