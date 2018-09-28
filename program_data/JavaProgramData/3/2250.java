package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] a = new int[1009];
		int t;
		int l;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	t = 0;
	l = 0;
	for (i = 1;i <= n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 1;i <= n;i++)
	{
		for (j = i + 1;j <= n;j++)
		{
			if (k == a[i] + a[j])
			{
				l = l + 1;

			}
	else
	{
	t = t + 1;
	}
		}
	}
	if (t == n * (n - 1) / 2)
	{
	System.out.print("no");
	}
	else if (l >= 1)
	{
	System.out.print("yes");
	}
	}

}

