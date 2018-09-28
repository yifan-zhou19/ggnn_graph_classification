package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		int j = 0;
		for (i = 2;i <= Math.sqrt(a);i++)
		{
			if (a == 2)
			{
				break;
			}
			else
			{
				if (a % i == 0)
				{
					j = 1;
					return (1);
					break;
				}
			}
		}
		if (j == 0)
		{
			return (0);
		}
	}


	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int x;
		int y;
		for (a = 6;a <= n;a++)
		{
			if (a % 2 == 0)
			{
				for (x = 3;x <= a / 2;x++)
				{
					y = a - x;
					if (sushu(x) == 0 && sushu(y) == 0)
					{
						System.out.printf("%d=%d+%d\n",a,x,y);
						break;
					}
				}
			}
		}
		return 0;
	}

}

