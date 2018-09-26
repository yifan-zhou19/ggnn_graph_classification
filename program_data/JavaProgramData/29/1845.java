package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	float s = 0F;
	int[] a = new int[n + 2];
	a[1] = 1;
	a[0] = 1;
	for (int j = 2;j < n + 2;j++)
	{
	a[j] = a[j - 1] + a[j - 2];
	}
	for (int j = 1;j <= n;j++)
	{
	s += 1.0 * a[j + 1] / a[j];
	}
	System.out.printf("%.3f\n",s);
	}
	}
}

