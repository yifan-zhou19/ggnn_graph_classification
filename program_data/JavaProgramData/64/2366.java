package <missing>;

public class GlobalMembers
{
	public static int[] t = new int[2000];

	public static double id(int a,int b,int c)
	{
		return Math.sqrt(a * a + b * b + c * c);

	}
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int m;
	 int s = 0;
	 int[] x = new int[20];
	 int[] y = new int[20];
	 int[] z = new int[20];
	 int[] q = new int[200];
	 int[] w = new int[200];
	 double[] d = new double[200];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < m;i++)

	 {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   x[i] = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   y[i] = Integer.parseInt(tempVar3);
			   }
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   z[i] = Integer.parseInt(tempVar4);
			   }

	 }
			n = m * (m - 1) / 2;
	for (i = 0;i < m - 1;i++)
	{

	for (j = i + 1;j < m;j++)
	{
	d[s] = id(x[i] - x[j], y[i] - y[j], z[i] - z[j]);
	q[s] = i;
	w[s] = j;
	s++;
	}
	}




			 //for(i=0;i<=n+1;i++)
			//{for(j=0;j<=n+1;j++)printf("%d ",a[i][j]);printf("\n");}
			for (i = 1;i <= n;i++)
			{
			for (j = 0;j < n - i;j++)
			{
			if (d[j] < d[j + 1])
			{
				swap(q[j],q[j + 1]);
				swap(w[j],w[j + 1]);
				swap(d[j],d[j + 1]);

			}
			}
			}



			for (j = 0;j < n;j++)
			{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[q[j]],y[q[j]],z[q[j]],x[w[j]],y[w[j]],z[w[j]],d[j]);
			}
			return 0;


	}
}

