package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{

		if (x == 2)
		{
			return 1;
		}
		else
		{
			int i;
			int c;

			c = Math.sqrt(x);
			for (i = 2;i <= c;i++)
			{
				if (x % i == 0)
				{
					return 0;
				}
			}
			return 1;
		}
	}
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i++)
		{
			if (i % 2 == 1)
			{
				continue;
			}
			else
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

		}

	}

}

