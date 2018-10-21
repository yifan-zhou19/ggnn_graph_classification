package <missing>;

public class GlobalMembers
{
	public static int zhiyinshu(int x)
	{
		int i = 2;
		while (i < x)
		{
			if (x % i == 0)
			{
				return 0;
			}
			else
			{
				i++;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int i;
		int j;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 3;i < j;i++)
		{
			j = x - i;
			if ((zhiyinshu(i) == 1) && (zhiyinshu(j)) != 0)
			{
				System.out.printf("%d %d\n",i,j);
			}
		}
		return 0;
	}

}

