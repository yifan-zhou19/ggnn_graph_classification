package <missing>;

public class GlobalMembers
{
	public static int tell(int x)
	{
		int i;
		int j;
		int count = 0;
		if (x == 2)
		{
			return 1;
		}
		else if (x % 2 == 0)
		{
			return 0;
		}
		j = (int)Math.sqrt(x);
		for (i = 2;i <= j;i++)
		{
			if (x % i == 0)
			{
				count++;
			}
		}
		if (count == 0)
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
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;j < i;j += 2)
			{
				if (tell(j) != 0 && tell(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
	return 0;
	}
}

