package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k1;
		int k2;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 100)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 1;i <= n;i++)
			{
				sum4 = (int)(sum4 + Math.pow(i,2));
				if (i % 7 == 0)
				{
					sum1 = (int)(sum1 + Math.pow(i,2));
				}
				else
				{
					k1 = i % 10;
					if (k1 == 7)
					{
						sum2 = (int)(sum2 + Math.pow(i,2));
					}
					else
					{
						k2 = (i % 100) / 10;
						if (k2 == 7)
						{
							sum3 = (int)(sum3 + Math.pow(i,2));
						}
					}
				}
			}
		}
		sum = sum4 - (sum1 + sum2 + sum3);
		System.out.printf("%d\n",sum);
		return 0;
	}

}

