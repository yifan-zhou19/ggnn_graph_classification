package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int t;
	int i;
	int z = 1;
	int[] a = new int[5];
	int m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	t = n;
	while (t / 10 != 0)
	{
		z++;
		t = t / 10;
	}
	for (i = 0;i < z;i++)
	{
	a[i] = n % 10;
	m = m * 10 + a[i];
	n = n / 10;
	}
	System.out.printf("%d",m);
	}
}

