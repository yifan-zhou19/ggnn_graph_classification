package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int counter = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				if (i > 0 && i < 10)
				{
					counter += 1;
					if (counter == 1)
					{
						System.out.printf("%d",i);
					}
					else
					{
						System.out.printf(",%d",i);
					}
				}
				else if (i >= 10 && i <= 99)
				{
					if (i / 10 == i % 10)
					{
						counter += 1;
						if (counter == 1)
						{
							System.out.printf("%d",i);
						}
						else
						{
							System.out.printf(",%d",i);
						}
					}
				}
				else if (i >= 100 && i <= 999)
				{
					if (i / 100 == i % 10)
					{
						counter += 1;
						if (counter == 1)
						{
							System.out.printf("%d",i);
						}
						else
						{
							System.out.printf(",%d",i);
						}
					}
				}
				else if (i >= 1000 && i <= 9999)
				{
					if (i / 1000 == i % 10 && (i % 1000) / 100 == (i % 100) / 10)
					{
						counter += 1;
						if (counter == 1)
						{
							System.out.printf("%d",i);
						}
						else
						{
							System.out.printf(",%d",i);
						}
					}
				}
				else if (i >= 10000 && i <= 99999)
				{
					if (i / 10000 == i % 10 && (i % 10000) / 1000 == (i % 100) / 10)
					{
						counter += 1;
						if (counter == 1)
						{
							System.out.printf("%d",i);
						}
						else
						{
							System.out.printf(",%d",i);
						}
					}
				}
			}
		}
		if (counter == 0)
		{
			System.out.print("no");
		}
		return 0;
	}


}

