package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int m = 0;
	int n;
	int[] x = new int[10];
	int[] y = new int[10];
	int[] z = new int[10];
	int a;
	int b;
	int c;
	int e;
	int f;
	int g;
	int[] x1 = new int[55];
	int[] y1 = new int[55];
	int[] z1 = new int[55];
	int[] x2 = new int[55];
	int[] y2 = new int[55];
	int[] z2 = new int[55];
	double[] jl = new double[55];
	double d;
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
	for (i = 0;i < n - 1;i++)
	{
		for (j = i + 1; j < n; j++)
		{
			jl[m] = Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2) + Math.pow(z[i] - z[j],2));
			x1[m] = x[i];
			x2[m] = x[j];
			y1[m] = y[i];
			y2[m] = y[j];
			z1[m] = z[i];
			z2[m] = z[j];
			m++;
		}
	}
	for (j = 0;j < m - 1;j++)
	{
		 for (i = 0;i < m - j - 1;i++)
		 {
		 if (jl[i] < jl[i + 1])
		 {
		 d = jl[i + 1];
		 jl[i + 1] = jl[i];
		 jl[i] = d;
		 a = x1[i + 1];
		 x1[i + 1] = x1[i];
		 x1[i] = a;
		 b = x2[i + 1];
		 x2[i + 1] = x2[i];
		 x2[i] = b;
		 c = y1[i + 1];
		 y1[i + 1] = y1[i];
		 y1[i] = c;
		 e = y2[i + 1];
		 y2[i + 1] = y2[i];
		 y2[i] = e;
		 f = z1[i + 1];
		 z1[i + 1] = z1[i];
		 z1[i] = f;
		 g = z2[i + 1];
		 z2[i + 1] = z2[i];
		 z2[i] = g;
		 }
		 }
	}
		for (i = 0;i < m;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x1[i],y1[i],z1[i],x2[i],y2[i],z2[i],jl[i]);
		}
	return 0;
	}

}

