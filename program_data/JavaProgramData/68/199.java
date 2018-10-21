package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int z;
		int k;
	if (a == 2)
	{
	z = 1;
	}
	for (k = 2;k <= Math.sqrt(a);k++)
	{
		if (a % k == 0)
		{
		z = 0;
		break;
		}
	}
	if (k > Math.sqrt(a))
	{
	z = 1;
	}
	return (z);
	}
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
	for (k = 3;2 * k <= n;k++)
	{
		i = 2 * k;
	if (sushu(i - 2) == 1)
	{
	System.out.printf("%d=2+%d\n",i,i - 2);
	}
	for (j = 3;j <= i / 2;j++)
	{
		if (sushu(i - j) == 1 && sushu(j) == 1)
		{
		System.out.printf("%d=%d+%d\n",i,j,i - j);
		break;
		}
	}
	}
	return 0;
	}

}

