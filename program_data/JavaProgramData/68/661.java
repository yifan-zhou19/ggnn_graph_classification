package <missing>;

public class GlobalMembers
{
	public static int judge(int a)
	{
		int temp;
		if (a % 2 != 0)
		{
			temp = 0;
			int i;
			for (i = 3;i <= Math.sqrt(a);i++)
			{
				if (a % i == 0)
				{
					temp++;
				}
			}
		}
		if (temp == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (m = 6;m <= n;m++)
			{
				if (m % 2 == 0)
				{
					for (i = 3;i < m;i++)
					{
						if (judge(i) == 1)
						{
							int j;
							j = m - i;
							if (judge(j) == 1)
							{
								System.out.printf("%d=%d+%d",m,i,j);
								break;
							}
							else
							{
								continue;
							}
						}
					}
					System.out.print("\n");
				}


			}
	}
}

