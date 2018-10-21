package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int t = 0;
	int[] f = new int[300];
	float[] a = new float[300];
	float[] d = new float[300];
	float s = 0F;
	float max = 0F;
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
		a[i] = Float.parseFloat(tempVar2);
	}
	s = s + a[i];
	}
	s = s / n;
	for (i = 0;i < n;i++)
	{
	d[i] = Math.abs((float)a[i] - s);
	if (d[i] > max)
	{
		max = d[i];
	}
	}
	for (i = 0;i < n;i++)
	{
	//printf("%f,",(d[i]-max));
	if ((max - d[i]) < 1e-6)
	{
	f[t] = a[i];
	t++;
	}
	}
	//printf("%f %f\n",s,max);
	for (i = 0;i < t - 1;i++)
	{
		System.out.printf("%d,",f[i]);
	}
	System.out.printf("%d\n",f[t - 1]);
	return (0);
	}

}

