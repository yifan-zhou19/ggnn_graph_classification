public class DIS
{
	public int fir;
	public int sec;
	public double d;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	   DIS[] dis = tangible.Arrays.initializeWithDefaultDISInstances(50);
	   final double eps = 1e-6;

	   int[] x = new int[11];
	   int[] y = new int[11];
	   int[] z = new int[11];
	   int n;
	   int i;
	   int j;
	   int k = 1;
	   DIS temp = new DIS();
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= n;i++)
	   {
		   x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (i = 1;i <= n - 1;i++)
	   {
		   for (j = i + 1;j <= n;j++)
		   {
			   dis[k].fir = i;
			   dis[k].sec = j;
			   dis[k++].d = Math.sqrt((double)(x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
		   }
	   }
	   for (i = 1;i <= n * (n - 1) / 2;i++)
	   {
		   for (j = n * (n - 1) / 2;j >= i + 1;j--)
		   {
			   if (dis[j].d > dis[j - 1].d + eps)
			   {
				   temp.d = dis[j].d;
				  temp.fir = dis[j].fir;
				  temp.sec = dis[j].sec;
				   dis[j].d = dis[j - 1].d;
				   dis[j].fir = dis[j - 1].fir;
				   dis[j].sec = dis[j - 1].sec;

				   dis[j - 1].d = temp.d;
					dis[j - 1].fir = temp.fir;
					dis[j - 1].sec = temp.sec;
			   }
		   }
	   }
	   for (i = 1;i <= n * (n - 1) / 2;i++)
	   {
		   System.out.print("(");
		   System.out.print(x[dis[i].fir]);
		   System.out.print(",");
		   System.out.print(y[dis[i].fir]);
		   System.out.print(",");
		   System.out.print(z[dis[i].fir]);
		   System.out.print(")-(");
		   System.out.print(x[dis[i].sec]);
		   System.out.print(",");
		   System.out.print(y[dis[i].sec]);
		   System.out.print(",");
		   System.out.print(z[dis[i].sec]);
		   System.out.print(")=");
		   System.out.printf("%.2f", dis[i].d);
		   System.out.printf("%.2f", "\n");
	   }





	 return 0;

	}


}

