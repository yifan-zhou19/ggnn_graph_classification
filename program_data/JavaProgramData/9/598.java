package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int k;
	int j;
	int l;
	int n;
	int w;
	int max;
	int old;
	int q = 0;
	char[][] d = new char[101][10];
	int[] a = new int[101];
	int[] b = new int[101];
	int[] c = new int[101];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	old = 0;
	for (i = 1;i <= n;i++)
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
	for (i = 1;i <= n;i++)
	{
	b[i] = 0;
	if (a[i] >= 60)
	{
	b[i] = 1;
	old = old + 1;
	}
	}



	for (i = 1;i <= old;i++)
	{
	max = 0;
	for (j = 1;j <= n;j++)
	{
	if (b[j] == 1)
	{
	if (a[j] > max)
	{
	max = a[j];
	w = j;
	}
	}
	}
	c[i] = w;
	b[w] = 2;
	}
	for (l = 1;l <= old;l++)
	{
	q = c[l];
	System.out.printf("%s\n",d[q]);
	}
	for (l = 1;l <= n;l++)
	{
	if (b[l] == 0)
	{
	System.out.printf("%s\n",d[l]);
	}
	}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}


}

