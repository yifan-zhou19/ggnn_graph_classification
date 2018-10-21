package <missing>;

public class GlobalMembers
{
	public static int sum(int m)
	{
	int i;
	int[] a = new int[100];
	for (i = 3;i <= 21;i++)
	{
	a[1] = 1;
	a[2] = 1;
	a[i] = a[i - 1] + a[i - 2];
	}
	return a[m];
	}
	public static int Main()
	{
	int m;
	int n;
	int i;
	int[] a = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a[1] = 1;
	a[2] = 1;
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	System.out.printf("%d\n",sum(m));
	}
	}


}

