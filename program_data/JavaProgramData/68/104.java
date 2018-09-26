package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int yes = 1;
		int i;
		for (i = 2;i <= Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
			yes = 0;
			break;
			}
		}
		return yes;
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
		for (j = 6;j <= n;j++)
		{
			if (j % 2 == 0)
			{
				for (i = 2;i <= j;i++)
				{
					if (sushu(i) != 0 && sushu(j - i) == 1)
					{
						System.out.printf("%d=%d+%d\n",j,i,j - i);
						break;
					}
				}
			}
		}

		return 0;
	}
}

