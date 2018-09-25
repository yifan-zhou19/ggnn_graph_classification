package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] a = new int[100];
	int[] b = new int[100];
	int[] c = new int[100];
	char[][] d = new char[100][100];
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
		d[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (j = 0;j <= n;j++)
	{
	if (a[j] >= 60)
	{
	b[j] = a[j] * 1000 - j;
	}
	else
	{
		b[j] = 1000 - j;
	}
	}
	for (j = 0;j <= n;j++)
	{
	c[j] = 0;
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	if (b[j] >= b[i])
	{
	c[i]++;
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	if (c[j] == i + 1)
	{
	System.out.printf("%s\n",d[j]);
	}
	}
	}
	}
}

