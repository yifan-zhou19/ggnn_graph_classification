package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] l = new int[10000];
	int[] r = new int[10000];
	int n;
	int i;
	int d;
	int e;
	int k;
	int p;
	int q;
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
		l[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		r[i] = Integer.parseInt(tempVar3);
	}
	}
	for (k = 1;k < n;k++)
	{
	for (i = 0;i < n - 1;i++)
	{
	if (l[i] > l[i + 1])
	{
	p = l[i + 1],q = r[i + 1];
	l[i + 1] = l[i],r[i + 1] = r[i];
	l[i] = p,r[i] = q;
	}
	}
	}
	for (k = 0;k < n - 1;k++)
	{
	for (i = 1;i < n;i++)
	{
	if (l[k] < l[i] && r[k]> r[i])
	{
	l[i] = l[k],r[i] = r[k];
	}
	}
	}
	for (i = 0;i < n - 1;i++)
	{
	if (r[i] < l[i + 1])
	{
	e = 0;
	break;
	}
	e = 1;
	}
	if (e == 0)
	{
		System.out.print("no");
	}
	else
	{
		for (i = 1,e = l[0];i < n;i++)
		{
	if (l[i] < e)
	{
	e = l[i];
	}
		}
	for (i = 1,d = r[0];i < n;i++)
	{
	if (r[i] > d)
	{
	d = r[i];
	}
	}
	System.out.printf("%d %d",e,d);
	}
	return 0;

	}


}

