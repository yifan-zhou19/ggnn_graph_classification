package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] n = new int[1000];
	int[][] a = new int[100][2000];
	int[][] b = new int[100][1000];
	int i;
	int j;
	int k;
	int l;
	int c;
	int[] q = new int[1000];
	int d;
	for (i = 0;;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n[i] = Integer.parseInt(tempVar);
	}
	if (n[i] == 0)
	{
	break;
	}
	for (j = 0;j < n[i];j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i][j] = Integer.parseInt(tempVar2);
	}
	}
	for (j = 0;j < n[i];j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (k = 0;k < i;k++)
	{
	for (j = 0;j < n[k];j++)
	{
	q[j] = 0;
	}
	for (l = 0;l < n[k];l++)
	{
	for (j = 0;j < n[k] - 1;j++)
	{
	if (a[k][j] < a[k][j + 1])
	{
	c = a[k][j];
	a[k][j] = a[k][j + 1];
	a[k][j + 1] = c;
	}
	}
	}
	for (l = 0;l < n[k];l++)
	{
	for (j = 0;j < n[k] - 1;j++)
	{
	if (b[k][j] < b[k][j + 1])
	{
	c = b[k][j];
	b[k][j] = b[k][j + 1];
	b[k][j + 1] = c;
	}
	}
	}
	for (j = n[k];j < n[k] * 2;j++)
	{
	a[k][j] = a[k][j - n[k]];
	}
	for (l = 0;l < n[k];l++)
	{
		q[l] = 0;
	for (j = l;j < l + n[k];j++)
	{
	if (a[k][j] > b[k][j - l])
	{
	q[l] += 200;
	}
	else if (a[k][j] < b[k][j - l])
	{
	q[l] -= 200;
	}
	}
	}
	d = q[0];
	for (j = 1;j < n[k];j++)
	{
	if (q[j] >= d)
	{
	d = q[j];
	}
	}
	System.out.printf("%d\n",d);
	}
	}
}

