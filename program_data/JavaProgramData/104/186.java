package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y;
	int[] a = new int[10000];
	int[] b = new int[10000];
	int i;
	int j;
	int k;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	if (x == y)
	{
	System.out.printf("%d",x);
	}
	else
	{
	a[1] = x;
	b[1] = y;
	for (i = 2;;i++)
	{
	if (a[i - 1] == 1)
	{
	break;
	}
	else if (a[i - 1] % 2 == 0)
	{
	a[i] = (a[i - 1] / 2);
	}
	else
	{
		a[i] = ((a[i - 1] - 1) / 2);
	}
	}
	for (j = 2;;j++)
	{
	if (b[j - 1] == 1)
	{
	break;
	}
	else if (b[j - 1] % 2 == 0)
	{
	b[j] = (b[j - 1] / 2);
	}
	else
	{
		b[j] = ((b[j - 1] - 1) / 2);
	}
	}
	for (k = i - 1,p = j - 1;;k--,p--)
	{
	if (a[k] != b[p])
	{
	break;
	}
	}
	System.out.printf("%d",a[k + 1]);
	}
	}
}

