package <missing>;

public class GlobalMembers
{
	public static void reverse(int a)
	{
		int i;
		int l;
		int b;
		i = 0;
		if (a == 0)
		{
			System.out.print("0");
		}
		while ((a % 10) == 0)
		{
				a = a / 10;
		}
		while (a != 0)
		{
					if (a > 0)
					{
							 b = a % 10;
							 System.out.printf("%d",b);
							   a = a / 10;

					}
					else if (a < 0)
					{
							b = a % 10;
							if (i == 0)
							{
							System.out.printf("%d",b);
							}
							else
							{
									  b = -b;
								   System.out.printf("%d",b);
							}
							 a = a / 10;
							 i++;
					}


		}


	}

	public static int Main()
	{
		int m;
		int a;
		int i = 1;
		while (i <= 6)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
		reverse(a);
		System.out.print("\n");
		i++;
		}

		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

