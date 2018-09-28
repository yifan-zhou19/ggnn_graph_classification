package <missing>;

public class GlobalMembers
{
	public static int su(int k)
	{
		int i;
		for (i = 2; i <= Math.sqrt(k);i++)
		{
			if (k % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int f = 6;
		int k;
		while (f <= n)
		{
			int i = 2;
			while (i <= (f / 2))
			{
				if (su(i) == 1)
				{
					k = f - i;
					if (su(k) == 1)
					{
						System.out.printf("%d=%d+%d\n",f,i,k);
						break;
					}
				}
				i++;
			}
			f += 2;
		}
		return 0;
	}

}

