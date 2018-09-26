package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] p;
		int[] a = new int[100];
		int n;
		int t = 0;
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
	p = a[0];
	for (i = 0;i < n - 1;i++)
	{
		t = p[n - 1];
	for (j = n - 1;j >= i + 1;j--)
	{
		p[j] = p[j - 1];
	}
	p[i] = t;
	}
	System.out.printf("%d",p[0]);
	for (p = a + 1;p < (a + n);p++)
	{
	System.out.printf(" %d",p[0]);
	}
	}
}

