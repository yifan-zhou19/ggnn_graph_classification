package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//	double x;
	//	double y;
	//	double z;
	//	}
	//	a[100];
		double[] b = new double[100];
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
		a[i].x = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i].y = tempVar3;
	}
	}
	for (i = n - 1;i >= 0;i--)
	{
		for (j = 0;j < i;j++)
		{
	a[j].z = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y));
		}
	for (j = 1;j < n;j++)
	{
	if (a[j - 1].z > a[j].z)
	{
		t = a[j - 1].z;
		a[j - 1].z = a[j].z;
		a[j].z = t;
	}
	}
	b[i] = a[n - 1].z;
	}
	for (j = 1;j < n;j++)
	{
	if (b[j - 1] > b[j])
	{
		t = b[j - 1];
		b[j - 1] = b[j];
		b[j] = t;
	}
	}
	System.out.printf("%.4lf\n",b[n - 1]);
	return 0;
	}
}

