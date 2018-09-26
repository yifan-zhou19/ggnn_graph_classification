package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] xy = new int[2];
	int[] ok = new int[100];
	int i;
	int n;
	int max = 0;
	int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		xy[0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		xy[1] = Integer.parseInt(tempVar3);
	}
	if (xy[0] <= 140 && xy[0] >= 90 && xy[1] <= 90 && xy[1] >= 60)
	{
	ok[i] = 1;
	}
	else
	{
	ok[i] = 0;
	}
	}
	for (i = 1;i <= n;i++)
	{
	if (ok[i] == 1)
	{
	t++;
	}
	else
	{
	t = 0;
	}
	if (t > max)
	{
	max = t;
	}
	}
	System.out.printf("%d",max);

	return 0;
	}

}

