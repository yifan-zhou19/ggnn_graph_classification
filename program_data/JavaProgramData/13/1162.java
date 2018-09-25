package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] c = new int[n];
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c[1] = Integer.parseInt(tempVar2);
	}
	System.out.printf("%d",c[1]);
	for (i = 2;i <= n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c[i] = Integer.parseInt(tempVar3);
	}
	for (j = 1;j <= i - 1;j++)
	{
	if (c[j] == c[i])
	{
		break;
	}
	}
	if (j == i)
	{
		System.out.printf(" %d",c[i]);
	}
	}
	return 0;
	}
}

