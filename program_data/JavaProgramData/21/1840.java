package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[20];
		int s;
		int h = 0;
		int i;
		int w = 0;
		int max;
		int min;
	float p;
	float q;
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
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	q = (float)n;
	for (i = 0,s = 0;i < n;i++)
	{
	s = s + a[i];
	}
	p = s / q;
	min = a[0];
	for (i = 0;i < n;i++)
	{
	if (a[i] < min)
	{
		min = a[i];
		h = i;
	}
	}
	max = a[0];
	for (i = 0;i < n;i++)
	{
	if (a[i] > max)
	{
		max = a[i];
		w = i;
	}
	}
	if (Math.abs(Math.abs((float)a[h] - p) - Math.abs((float)a[w] - p)) < 1e-5)
	{
	System.out.printf("%d,%d",a[h],a[w]);
	}
	else if (Math.abs((float)a[h] - p) > Math.abs((float)a[w] - p))
	{
	System.out.printf("%d",a[h]);
	}
	else if (Math.abs((float)a[h] - p) < Math.abs((float)a[w] - p))
	{
	System.out.printf("%d",a[w]);
	}
	}
}

