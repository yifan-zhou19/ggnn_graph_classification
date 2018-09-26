package <missing>;

public class GlobalMembers
{
	public static int[] number = new int[50000];
	public static int check(int x)
	{
		if (x == 3)
		{
			return 1;
		}
		for (int y = 3;y < x;y = y + 2)
		{
			if (x % y == 0)
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
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n;i += 2)
		{
			number[i] = check(i);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
				if (number[j] == 1 && number[i - j] == 1)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
	}
}

