package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int n1;
		int apple = new int(int n,int k);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",apple(n, k));
		return 0;
	}
	public static int apple(int n,int k)
	{
		int num;
		int i;
		int j;
		for (i = 1;;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (j == 1)
				{
					num = i * n + k;
				}
				else
				{
					if (num % (n - 1) == 0)
					{
						num = num / (n - 1) * n + k;
						if (j == n)
						{
							break;
						}
					}
					else
					{
						j = 0;
						break;
					}
				}
				if (j == n)
				{
					break;
				}
			}
			if (j == n)
			{
				break;
			}
		}
		return num;
	}



}

