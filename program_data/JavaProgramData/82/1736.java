package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int y;
	int i;
	int j;
	int k;
	int max;
	int n;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	i = 1,j = 1,k = 1,max = 0,t = 0;
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		y = Integer.parseInt(tempVar3);
	}
	if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
	{
	k = i;
	t = k - j + 1;
	if (max >= t)
	{
	max = max;
	}
	else
	{
	max = t;
	}
	}
	else
	{
	k = i;
	j = i + 1;
	}
	}
	System.out.printf("%d",max);
	return 0;
	}
}

