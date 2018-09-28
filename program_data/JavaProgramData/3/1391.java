package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] ss = new int[1000];
	int[] zz = new int[1000];
	int n;
	int k;
	int num;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		num = Integer.parseInt(tempVar3);
	}
	ss[i] = num;
	zz[i] = num;
	}
	int[][] sz = new int[1000][1000];
	int h;
	int l;
	for (h = 0;h < n;h++)
	{
	for (l = 0;l < n;l++)
	{
	sz[h][l] = ss[h] + zz[l];
	if (sz[h][l] == k && h != l)
	{
		System.out.print("yes");
		break;
	}
	else if (h == n - 1 && l == n - 1)
	{
		System.out.print("no");
		break;
	}
	}

	if (sz[h][l] == k && h != l)
	{
		break;
	}

	else if (h == n - 1 && l == n - 1)
	{
		break;
	}
	}
	return 0;
	}
}

