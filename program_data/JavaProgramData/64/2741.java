public class point
 {
public int x;
public int y;
public int z;
 } //?????????

package <missing>;

public class GlobalMembers
{
	public static point[] dian = tangible.Arrays.initializeWithDefaultpointInstances(101);
	public static double distance(point[] dian, int i, int j)
	{
		int x = dian[i].x - dian[j].x;
		int y = dian[i].y - dian[j].y;
		int z = dian[i].z - dian[j].z;
		double dis = (double)(x * x + y * y + z * z);
		return Math.sqrt(dis);
	}
	 public static int Main()
	 {
		 int n;
		 int i;
		 int j;
		 int t = 0;
		 int k = 0;
		 double[] a = new double[105];
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 0;i < n;++i)
		 {
			 dian[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 dian[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 dian[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (i = 0;i < n;++i)
		 {
			 for (j = i + 1;j < n;++j)
			 {
					 int t = 0;
					   while (t < k + 1 && (a[t] - distance(dian, i, j)>0.00001 || distance(dian, i, j) - a[t] > 0.00001))
					   {
						   t++;
					   }
					   if (t == k + 1)
					   {
						   a[k] = distance(dian, i, j);
					k++;
					   }
			 }
		 }
		 int count = k;
		 for (i = 0;i < count;i++)
		 {
			 for (j = 0;j < count - i;j++)
			 {
				 if (a[j] < a[j + 1])
				 {
					 double temp = a[j];
					 a[j] = a[j + 1];
					 a[j + 1] = temp;
				 }
			 }
		 }
					  k = 0;
					  while (k < count)
					  {
						for (i = 0;i < n;++i)
						{
						for (j = i + 1;j < n;++j)
						{

							if (Math.abs(a[k] - distance(dian, i, j)) < 0.0000001)
							{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n\n",dian[i].x,dian[i].y,dian[i].z,dian[j].x,dian[j].y,dian[j].z,distance(dian, i, j));
							}
						}
						}
						k++;
					  }
						 //while(1); 
		 return 0;
	 }
}

