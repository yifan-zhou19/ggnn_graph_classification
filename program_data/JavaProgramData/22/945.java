package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int s;
		int t;
		int[] a = new int[301];
	char c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[1] = Integer.parseInt(tempVar);
	}
	n = 1;
	for (i = 2;i <= 300;i++)
	{
		c = System.in.read();
	n = i - 1;
	if (c == '\n')
	{
	break;
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (j = 1;j <= n - 1;j++)
	{
	for (i = 1;i <= n - j;i++)
	{
	if (a[i] > a[i + 1])
	{
		t = a[i];
		a[i] = a[i + 1];
		a[i + 1] = t;
	}
	}
	}
	t = a[n];
	for (j = n - 1;j >= 1;j--)
	{
	if (a[j] < t)
	{
		t = a[j];
	break;
	}
	}
	if (t == a[n])
	{
	System.out.print("No");
	}
	else
	{
		System.out.printf("%d",t);
	}
	return 0;
	}
}

