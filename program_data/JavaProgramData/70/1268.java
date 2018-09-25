public class point
{
	public double x;
	public double y;
}

package <missing>;

public class GlobalMembers
{
	public static point[] dian = tangible.Arrays.initializeWithDefaultpointInstances(101);
	public static double dis(point[] dian, int i, int j)
	{
		double x = dian[i].x - dian[j].x;
		double y = dian[i].y - dian[j].y;
		double dis = (x * x + y * y);
		return Math.sqrt(dis);
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		int k = 0;
		double[] a = new double[102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			dian[i].x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			dian[i].y = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		 for (i = 0;i < n;++i)
		 {
			 for (j = i + 1;j < n;++j)
			 {
				int t = 0;
			   while (t < k + 1 && Math.abs(a[t] - dis(dian, i, j))>1e-6)
			   {
				   t++;
			   }
			   if (t == k + 1)
			   {
			   a[k] = dis(dian, i, j);
			   k++;
			   }
			 }
		 }
		  for (i = 0;i < k;i++)
		  {
			 for (j = 0;j < k - i;j++)
			 {
				 if (a[j] < a[j + 1])
				 {
					 double temp = a[j];
					 a[j] = a[j + 1];
					 a[j + 1] = temp;
				 }
			 }
		  }
				 System.out.print(a[0]);
				 System.out.print("\n");

		//while(1);
		return 0;
	}
}

