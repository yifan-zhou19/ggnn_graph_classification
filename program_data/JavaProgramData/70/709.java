package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] l = new double[2000];
		double d;
		int n;
		int b;
		int i;
		int j;
		float[] q = new float[50];
		float[] w = new float[50];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		q[i] = Float.parseFloat(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		w[i] = Float.parseFloat(tempVar3);
	}
	}
	b = 1;
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n;j++)
	{
		l[b] = (double)((q[i] - q[j]) * (q[i] - q[j]) + (w[i] - w[j]) * (w[i] - w[j]));
		b = b + 1;
	}
	}
	d = l[1];
	for (j = 1;j < b;j++)
	{
		if (d <= l[j])
		{
	d = l[j];
		}
	}

	System.out.printf("%.4f\n",(float)(Math.sqrt(d)));
	}
}

