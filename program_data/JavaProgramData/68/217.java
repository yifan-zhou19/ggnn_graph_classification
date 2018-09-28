package <missing>;

public class GlobalMembers
{
	public static int fflag(int i)
	{
	int j;
	if (i <= 1)
	{
		return 0;
	}
	if (i == 2)
	{
		return 1;
	}
	if ((i % 2) == 0)
	{
		return 0;
	}
	for (j = 3;j <= (int)(Math.sqrt((double)i) + 1);j += 2)
	{
	if ((i % j) == 0)
	{
		return 0;
	}
	}
	return 1;
	}
	public static int Main()
	{
	int i;
	int n;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	for (i = 6;i <= t;i += 2)
	{
	for (n = 2;n < i;n++)
	{
	if (fflag(n) != 0)
	{
	if (fflag(i - n) != 0)
	{
	System.out.printf("%d=%d+%d\n",i,n,i - n);
	break;
	}
	}
	}
	if (n == i)
	{
		System.out.printf("error %d\n",i);
	}
	}
	}
}

