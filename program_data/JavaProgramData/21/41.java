package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[300];
	int[] c = new int[300];
	int i;
	int j;
	int n;
	int k = 0;
	int l = 0;
	float z = 0F;
	float[] b = new float[300];
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
	for (i = 0;i < n;i++)
	{
	z = z + a[i];
	}
	z = z / n;
	for (i = 0;i < n;i++)
	{
		if (a[i] > z)
		{
	b[i] = a[i] - z;
		}
	else
	{
		b[i] = z - a[i];
	}
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
		if (b[j] > b[i])
		{
	c[i]++;
		}
		}
	}
	for (i = 0;i < n;i++)
	{
		if (c[i] == 0)
		{
	k++;
		}
	}
	for (i = 0;i < n;i++)
	{
		if (c[i] == 0)
		{
		l++;
	if (l == k)
	{
		System.out.printf("%d",a[i]);
	}
	else
	{
		System.out.printf("%d,",a[i]);
	}
		}
	}
	}
}

