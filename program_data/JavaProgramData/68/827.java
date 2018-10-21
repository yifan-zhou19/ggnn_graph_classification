package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i = 2;
	for (i = 2;i <= Math.sqrt(n);i++)
	{
	if (n % i == 0)
	{
		break;
	}
	}
	if (i > Math.sqrt(n))
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}
	public static void Main()
	{
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	int j = 6;
	int i = 2;
	for (j = 6;j <= m;j = j + 2)
	{
		for (i = 2;i <= j / 2;i++)
		{
			if (sushu(i) == 1 && sushu(j - i) == 1)
			{
		break;
			}
		}
		System.out.printf("%d=%d+%d",j,i,j - i);
		System.out.print("\n");



	}

	}
}

