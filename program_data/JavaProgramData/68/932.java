package <missing>;

public class GlobalMembers
{
	public static int issushu(int a)
	{
		int i;
		int sqrta;
		if (a % 2 == 0)
		{
			return 0;
		}
		sqrta = (int)Math.sqrt(a);
		for (i = 3;i <= sqrta;i++)
		{
			if (a % i == 0)
			{
				return 0;
			}
		}
		return 1;
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
		for (j = 3;j <= n;j++)
		{
			if (j % 2 == 0)
			{

				for (i = 2;i <= (j / 2);i++)
				{
					if (issushu(i) != 0 && issushu(j - i) != 0)
					{
						System.out.printf("%d=%d+%d\n",j,i,j - i);
						break;
					}
				}
			}
		}


	}
}

