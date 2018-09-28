package <missing>;

public class GlobalMembers
{
	public static int issushu(int n)
	{
		int x;
		for (x = 2;x <= Math.sqrt(n);x = x + 1)
		{
			if (n % x == 0)
			{
				break;
			}
		}
			if (x > Math.sqrt(n))
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
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int num;
		num = 0;
		for (i = 3;((i + 2) <= n);i = i + 2)
		{
			//printf("here");
			if (issushu(i) != 0)
			{
				if (issushu(i + 2) != 0)
				{
					//printf("here");
					System.out.printf("%d %d\n",i,i + 2);
				}
				num = num + 1;
			}
		}
		if (num == 0)
		{
			System.out.print("empty\n");
		}
	}



}

