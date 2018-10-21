package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int i;
	int j;
	int k;
	int c;
	int n;
	int prize;
	int w;
	int max;
	int[] a = new int[1001];
	int[] b = new int[1001];
	for (;;)
	{
		   max = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 0)
	{
	break;
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (j = 1;j <= n;j++)
	{
	for (i = 1;i < j;i++)
	{
	if (b[j] > b[i])
	{
	c = b[j];
	for (k = j;i < k;k--)
	{
	b[k] = b[k - 1];
	}
	b[i] = c;
	}
	}
	}
	for (j = 1;j <= n;j++)
	{
	for (i = 1;i < j;i++)
	{
	if (a[j] > a[i])
	{
	c = a[j];
	for (k = j;i < k;k--)
	{
	a[k] = a[k - 1];
	}
	a[i] = c;
	}
	}
	}
	for (i = 1;i <= n;i++)
	{

					 prize = 0;
	for (k = 1;k <= n;k++)
	{
	if (a[k] > b[k])
	{
	prize = prize+200;
	}
	else if (a[k] < b[k])
	{
	prize = prize-200;
	}
	}
	w = a[n];
	for (j = n;j > 1;j--)
	{
	a[j] = a[j - 1];
	}
	a[1] = w;
	if (i == 1)
	{
	max = prize;
	}
	if (prize >= max)
	{
	max = prize;
	}
	}
	System.out.printf("%d\n",max);
	}
	}


}

