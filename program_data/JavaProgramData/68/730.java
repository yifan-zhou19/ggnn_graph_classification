package <missing>;

public class GlobalMembers
{
	public static int issushu(int x)
	{
	double y;
	int i;
	int flag;
	flag = 1;
	y = Math.sqrt((double)x);
	for (i = 3;i <= y;i += 2)
	{
	if (x % i == 0)
	{
		flag = 0;
	}
	}
	return flag;
	}
	public static int Main()
	{
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 6;i <= n;i += 2)
	{
	for (j = 3;j <= i / 2;j += 2)
	{
	if (issushu(j) != 0 && issushu(i - j) != 0)
	{
	System.out.printf("%d=%d+%d\n",i,j,i - j);
	break;
	}
	}
	}
	return 0;
	}
}

