package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int t;
		int s;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		for (i = 6;i <= n;i = i + 2)
		{

			for (k = 3;k <= i;k = k + 2)
			{
				for (j = 3;j <= Math.sqrt(k);j++)
				{
					if (k % j == 0)
					{
						break;
					}
				}
				if (j > Math.sqrt(k))
				{
					b = i - k;
				for (l = 2;l <= Math.sqrt(b);l++)
				{

					if (b % l == 0)
					{
						break;
					}
				}
				if (l > Math.sqrt(b))
				{
					System.out.printf("%ld=%ld+%ld\n",i,k,b);
					break;
				}
				}
			}
		}
	}

}

