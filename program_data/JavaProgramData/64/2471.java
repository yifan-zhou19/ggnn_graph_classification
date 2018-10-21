package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int sf;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int k = 0;
	int[] x = new int[10];
	int[] y = new int[10];
	int[] z = new int[10];
	int[] a = new int[200];
	int[] b = new int[200];
	double[] s = new double[200];
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		y[i] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		z[i] = Integer.parseInt(tempVar4);
	}
	}
	for (int i = 0;i < n;i++)
	{
	 for (int j = i + 1;j < n;j++)
	 {
		sf = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
		s[k] = Math.sqrt(sf);
		a[k] = i;
		b[k] = j;
		 k++;
	 }
	}
		int l;
		double u;
	for (int q = 1;q < k;q++)
	{
	 for (int w = 0;w < k - q;w++)
	 {
	   if (s[w] < s[w + 1])
	   {
		u = s[w];
		s[w] = s[w + 1];
	   s[w + 1] = u;
		 l = a[w];
		a[w] = a[w + 1];
	   a[w + 1] = l;
		l = b[w];
		b[w] = b[w + 1];
	   b[w + 1] = l;

	   }
	 }
	}
	for (int i = 0;i < k;i++)
	{
	System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[a[i]],y[a[i]],z[a[i]],x[b[i]],y[b[i]],z[b[i]],s[i]);
	}
	return 0;
	}


}

