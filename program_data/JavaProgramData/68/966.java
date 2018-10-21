package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		int gha;
		if (a % 2 == 0)
		{
			return 0;
		}
		gha = (int)Math.sqrt(a);
		for (i = 3;i <= gha;i += 2)
		{
			if (a % i == 0)
			{
				return 0;
			}
		}
		return 1;
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
			for (j = 2;j <= i / 2;j++)
			{
				if (sushu(j) != 0 && sushu(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}

		return 0;
	}

}

