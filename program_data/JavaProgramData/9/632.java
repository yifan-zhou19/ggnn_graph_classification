package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int t;
	int[] d = new int[100];
	char[][] c = new char[100][10];
	String e = new String(new char[10]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c[i - 1] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		d[i - 1] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 1;i <= n - 1;i++)
	{
	for (k = n;k >= i + 1;k--)
	{
	if (d[k - 1] > d[k - 2] && d[k - 1] >= 60)
	{
	t = d[k - 2];
	d[k - 2] = d[k - 1];
	d[k - 1] = t;
	e = c[k - 2];
	c[k - 2] = c[k - 1];
	c[k - 1] = e;
	}
	}
	}
	for (i = 1;i <= n;i++)
	{
	System.out.printf("%s\n",c[i - 1]);
	}
	System.in.read();
	System.in.read();
	}

}

