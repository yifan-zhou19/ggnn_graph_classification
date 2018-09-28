package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int r;
	int s;
	int[][] sz = new int[100][100];
	int R;
	int C;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		R = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		C = Integer.parseInt(tempVar2);
	}
	for (s = 0;s < R;s++)
	{
	System.out.print("\n");
	for (r = 0;r < C;r++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[s][r] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (s = 0;s < C + R - 1;s++)
	{
	for (r = 0;r <= s;r++)
	{
	if (s - r >= C)
	{
	continue;
	}
	if (r >= R)
	{
	break;
	}
	System.out.printf("%d\n",sz[r][s - r]);
	}
	}
	return 0;
	}
}

