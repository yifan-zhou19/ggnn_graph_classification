package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];
	s = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b[i] = Integer.parseInt(tempVar2);
	}
	if (b[i] % 2 != 0)
	{
		a[s] = b[i];
		s++;
	}
	}
	while (n > 0)
	{
		n = 0;
	for (i = 0;i < s - 1;i++)
	{
	if (a[i] > a[i + 1])
	{
		a[i] = a[i] + a[i + 1];
	a[i + 1] = a[i] - a[i + 1];
	a[i] = a[i] - a[i + 1];
	n++;
	}
	}
	}
	for (i = 0;i < s - 1;i++)
	{
	System.out.printf("%d,",a[i]);
	}
	System.out.printf("%d\n",a[s - 1]);
	return 0;
	}
}

