package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
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
	int[] sz = new int[NUMBER];
	int i;
	int m;
	int q = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(sz[i]) = Integer.parseInt(tempVar3);
	}
	}
	int[] szf = new int[NUMBER];

	for (i = 0;i < n;i++)
	{
	szf[i] = k - sz[i];
	}
	for (m = 0;m < n;m++)
	{
	for (i = 0;i < n;i++)
	{
	if (szf[m] == sz[i] && szf[m] != sz[m])
	{
	System.out.print("yes");
	q = 1;
	break;
	}
	}
	if (q != 0)
	{
		break;
	}
	}
	if (q == 0)
	{
		System.out.print("no");
	}
	return 0;
	}


}

