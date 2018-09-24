package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 100)
		{
			System.out.print("001");
		}
		else
		{
			if (a <= 9)
			{
			System.out.printf("%d",a);
			}
			else
			{
				if (a <= 99)
				{
					b = a % 10 * 10 + a / 10;
				System.out.printf("%d",b);
				}
				else
				{
					if (a <= 999)
					{
						b = a % 10 * 100 + (a / 10) % 10 * 10 + a / 100;
					System.out.printf("%d",b);
					}
					else
					{
						if (a <= 9999)
						{
							b = a % 10 * 1000 + (a / 10) % 10 * 100 + (a / 100) % 10 * 10 + a / 1000;
						System.out.printf("%d",b);
						}
					}
				}
			}
		}
						return 0;
	}
}

