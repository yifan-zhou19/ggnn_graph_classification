package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[1000];
	int[] b = new int[1000];
	int i;
	int j;
	int k;
	int n;
	int q = 0;
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
	b[i] = a[i];
	}
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= n;j++)
		{
	if (a[i] + b[j] == k)
	{
	q++;
	}
		}
	}
	if (q == 0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.print("yes");
	}
	}





}

