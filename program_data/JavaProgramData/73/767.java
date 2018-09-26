public class dian
{
	public int x;
	public int y;
	public int zhi;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] a = new int[5][5];
	   int c;
	   int e;
	   int i;
	   int j;
	   int count = 0;
	   dian[] b = tangible.Arrays.initializeWithDefaultdianInstances(5);
	   dian andian = new dian();
	   for (i = 0;i < 5;i++)
	   {
	   for (j = 0;j < 5;j++)
	   {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar);
	   }
	   }
	   }
	   for (i = 0;i < 5;i++) //  i ?? ??
	   {
					   int d = 0;
					   andian.zhi = a[i][0];
					   andian.x = 1;
					   andian.y = i + 1;
					   for (j = 1;j < 5;j++)
					   {
						   if (andian.zhi < a[i][j])
						   {
							   andian.zhi = a[i][j];
							   andian.x = 1 + j;
						   }
					   } //?????????
					   c = andian.zhi;
					   for (j = 0;j < 5;j++)
					   {
						   if (a[j][andian.x - 1] < c)
						   {
							   d++;
						   }
					   }
					   if (d == 0)
					   {
						   System.out.printf("%d %d %d\n",andian.y,andian.x,andian.zhi);
						   count++;
					   }
	   }
	   if (count == 0)
	   {
		   System.out.print("not found");
	   }
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

