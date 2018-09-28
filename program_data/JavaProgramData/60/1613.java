package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int n;
		int i;
		int a;
		int j;
		int k;
		int b = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 3;i <= (n - 2);i++)
			{
				k = Math.sqrt(i);
				for (j = 2;j <= k;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
				if (j > k)
				{
						a = i + 2;
						k = Math.sqrt(a);
						for (j = 2;j <= k;j++)
						{
							if (a % j == 0)
							{
						break;
							}
						}
						if (j > k)
						{

							b = 1;
						System.out.printf("%d %d\n",i,a);
						}

				}
			}
			if (b == 0)
			{
				System.out.print("empty");
			}
	}


}

