package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[300];
	int n;
	int i;
	int j;
	int s = 0;
	float b;
	float t;
	float[] k = new float[300];
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
	s = s + a[i];
	}
	b = (double)s / n;
	t = Math.abs(a[0] - b);
	for (i = 0;i < n;i++)
	{
	k[i] = Math.abs(a[i] - b);
	if (k[i] > t)
	{
	t = k[i];
	}
	}
	for (i = 0;i < n;i++)
	{

	if (k[i] == t)
	{
		System.out.printf("%d",a[i]);
	j = i + 1;
	break;
	}
	}
	for (i = j;i < n;i++)
	{
	if (k[i] == t)
	{
	System.out.printf(",%d",a[i]);
	}
	}
	}

}

