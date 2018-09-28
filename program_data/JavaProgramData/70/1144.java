package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int k;
		 double s;
		 double t;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 double[] p = new double[n];
		 double[] q = new double[n];
		 for (i = 0;i < n;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 p[i] = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 q[i] = Double.parseDouble(tempVar3);
		 }
		 }
		 s = 0.0;
		 for (i = 0;i < n - 1;i++)
		 {
			for (j = i + 1;j < n;j++)
			{
				t = Math.sqrt((p[i] - p[j]) * (p[i] - p[j]) + (q[i] - q[j]) * (q[i] - q[j]));
			   // printf("%lf\n",t);
				if (t > s)
				{
					s = t;
				}
			}
		 }
		 System.out.printf("%.4lf\n",s);

	}
}

