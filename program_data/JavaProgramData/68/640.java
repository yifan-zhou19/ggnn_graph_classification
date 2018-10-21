package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int prime = int x;
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
			for (j = 3;j <= i / 2;j++)
			{
				if ((prime(j) == 1) && (prime(i - j) == 1))
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
	}

	public static int prime(int x)
	{
		int t = 1;
		int i;
		if (x % 2 == 0)
		{
			t = 0;
		}
		i = 3;
		while (i * i < x + 1)
		{
			if (x % i == 0)
			{
				t = 0;
				break;
			}
			i += 2;
		}
		return t;
	}
}

