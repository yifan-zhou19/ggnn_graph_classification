package <missing>;

public class GlobalMembers
{
	public static int sushu(int k)
	{
		int i;
	for (i = 2;i <= Math.sqrt(k);i++)
	{
	if (k % i == 0)
	{
		break;
	}
	}
	if (i > Math.sqrt(k))
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}
	public static int Main()
	{
		int n;
		int i;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (i = 2;i <= n - 2;i++)
	{
	if (sushu(i) != 0 && sushu(i + 2) != 0)
	{
		System.out.printf("%d %d\n",i,i + 2);
		b = 1;
	}
	}
	if (b == 0)
	{
		System.out.print("empty");
	}

	}
}

