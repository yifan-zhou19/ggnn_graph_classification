package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int h;
		int x;
		int m;
		int j;
		int sushu = int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 6;j <= m;j += 2)
		{
			for (i = 3;i <= j / 2;i += 2)
			{
				h = sushu(i);
				if (h == 0)
				{
					continue;
				}
				else
				{
					x = j - i;
					h = sushu(x);
					if (h == 0)
					{
						continue;
					}
					else
					{
						System.out.printf("%d=%d+%d\n",j,i,x);
					}
					break;
				}
			}
		}
	}

	public static int sushu(int i)
	{
		int j;
		int k;
		k = Math.sqrt(i);
		for (j = 2;j <= k;j++)
		{
			if (i % j == 0)
			{
				break;
			}
		}
		if (j > k)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}







}

