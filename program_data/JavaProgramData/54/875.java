package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int k;
	int i = 1;
	int j = 0;
	int x;
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
	for (i = 1;j < n - 1;i++)
	{
		x = i;
		j = 0;
	while ((n * x + k) % (n - 1) == 0)
	{
		x = (n * x + k) / (n - 1);
		j++;
	if (j == n - 1)
	{
		break;
	}
	}
	}
	System.out.printf("%d",n * x + k);
	return 0;
	}
}

