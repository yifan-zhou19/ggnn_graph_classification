package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int k;
		int n;
		int i;
		int j;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (x = 6;x <= a;x += 2)
		{
			k = 3;
			do
			{
				i = 3;
				for (n = k;i <= Math.sqrt(n);)
				{
					for (i = 3;i <= Math.sqrt(n);i += 2)
					{
						if (n % i == 0)
						{
							break;
						}
					}
					if (i <= Math.sqrt(n))
					{
						n = n + 2;
					}
				}
				for (j = 3;j <= Math.sqrt(x - n);j += 2)
				{
					if ((x - n) % j == 0)
					{
						break;
					}
				}
				k = n + 2;
			}while (j <= Math.sqrt(x - n));
			System.out.printf("%d=%d+%d\n",x,n,x - n);
		}
	}
}

