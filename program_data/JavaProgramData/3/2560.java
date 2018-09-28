package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int m;
	int n;
	int p = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	int[] a = new int[1000];
	int[][] b = new int[1000][1000];
	for (i = 1;i <= m;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 1;i <= m;i++)
	{
	for (j = i + 1;j <= m;j++)
	{
	b[i][j] = a[i] + a[j];
	}
	}
	for (i = 1;i <= m;i++)
	{
		if (p == 1)
		{
	break;
		}
	for (j = 1;j <= m;j++)
	{
		if (b[i][j] == n)
		{
		p = 1;
		break;
		}
	}
	}
	if (p == 1)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}
	}
}

