package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i = 1;
		int sum1 = 0;
		int sum2 = 0;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

			if (n <= 9)
			{
				for (i = 1;i <= n;i++)
				{
				if (i != 7)
				{
					sum1 = sum1 + i * i;
				}
				}
				System.out.printf("%d",sum1);

			}
			else
			{
				for (i = 1;i <= n;i++)
				{
				if (i <= 9)
				{
					if (i != 7)
					{

					sum1 = sum1 + i * i;
					}
				}

				else
				{
					if ((i / 10 != 7) && (i % 10 != 7) && (i % 7 != 0))
					{
						sum2 = sum2 + i * i;
					}
				}
				}
				sum = sum1 + sum2;
				System.out.printf("%d",sum);
			}
	}

}

