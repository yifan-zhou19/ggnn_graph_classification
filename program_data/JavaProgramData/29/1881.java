package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int i;
	int j;
	int n;
	float[] a = new float[100];
	float[] b = new float[100];
	a[1] = 1F, a[2] = 2F,b[1] = 2F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (j = 0;j < m;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 3;i <= n + 1;i++)
	{
	a[i] = a[i - 1] + a[i - 2];
	b[i - 1] = b[i - 2] + a[i] / a[i - 1];
	}
	System.out.printf("%.3f\n",b[n]);
	}
	return 0;
	}



}

