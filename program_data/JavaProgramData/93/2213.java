package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int a;
		int b;
		int c;
		int d;
		int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m % 3 == 0)
		{
			a = 1;
		}
		else
		{
			a = 0;
		}
		if (m % 5 == 0)
		{
			b = 1;
		}
		else
		{
			b = 0;
		}
		if (m % 7 == 0)
		{
			c = 1;
		}
		else
		{
			c = 0;
		}

		sum = a + b + c;

		if (sum == 3)
		{
			System.out.print("3 5 7\n");
		}
		else
		{
			if (sum == 2)
			{
				if (a == b)
				{
					System.out.print("3 5");
				}
				else
				{
					if (a == c)
					{
						System.out.print("3 7");
					}
					else
					{
						System.out.print("5 7");
					}
				}
			}
			else
			{
				if (sum == 1)
				{
					d = a * 3 + b * 5 + c * 7;
					System.out.printf("%d\n",d);
				}
				else
				{
					System.out.print("n\n");
				}
			}
		}

	}
}

