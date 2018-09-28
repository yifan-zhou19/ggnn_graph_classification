package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int huai;
	int n;
	int j;
	int[] sz = new int[100];
	int k;
	int r;
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
		huai = Integer.parseInt(tempVar2);
	}
	if (huai == 0 && i == n - 1)
	{
		System.out.print("60");
		break;
	}
	if (huai == 0 && i != n - 1)
	{
		System.out.print("60\n");
		continue;
	}
	for (j = 0;j < huai;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[j] = Integer.parseInt(tempVar3);
	}
	}
	for (j = 0;j < huai;j++)
	{
	k = sz[j] + 3 * (j + 1);
	if (k >= 60)
	{
		break;
	}
	}
	if (j == huai)
	{
		r = 60 - 3 * huai;
	}
	if (k >= 60 && k <= 63)
	{
		r = sz[j];
	}
	if (k > 63)
	{
		r = 60 - 3 * j;
	}
	if (j == n - 1)
	{
		System.out.printf("%d",r);
	}
	else
	{
		System.out.printf("%d\n",r);
	}
	}
		return 0;
	}
}

