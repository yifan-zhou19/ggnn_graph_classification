package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 1;i <= n;i++)
	{
	int k;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	int[] sz = new int[100];
	if (k == 0)
	{
		System.out.print("60\n");
	}
	else
	{
	for (int a = 1;a <= k;a++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[a] = Integer.parseInt(tempVar3);
	}
	}
	int p;
	if ((sz[k] + 3 * k) < 60)
	{
		p = 60 - 3 * k;
	System.out.printf("%d\n",p);
	}
	else
	{
		for (int b = 1;b <= k;b++)
		{
	int q;
	q = sz[b] + 3 * (b - 1);
	if (q >= 57 && q <= 60)
	{
		p = sz[b];
	System.out.printf("%d\n",p);
	break;
	}
	else if (q > 60)
	{
	p = 60 - 3 * (b - 1);
	System.out.printf("%d\n",p);
	break;
	}
		}
	}
	}
	}
	return 0;
	}


}

