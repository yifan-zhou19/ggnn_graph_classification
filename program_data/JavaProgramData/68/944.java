package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int a = 0;
		int b = 0;
		int zhi = int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i++)
		{
			for (j = 3;j <= i;j++)
			{
				if (zhi(j) != 0)
				{
					if (zhi(i - j) != 0)
					{
						a = j;
						b = i - j;
						break;
					}
				}
				j++;
			}
			System.out.printf("%d=%d+%d\n",i,a,b);
			i++;
		}
		return 0;
	}

	public static int zhi(int x)
	{
		int i;
		int e = 0;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				e = 1;
				break;
			}
		}
		if (e == 0)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}


}

