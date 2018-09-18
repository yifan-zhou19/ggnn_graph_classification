package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 10000)
		{
			System.out.print("00001");
		}
		else if (n == 1000)
		{
			System.out.print("0001");
		}
		else if (n == 100)
		{
			System.out.print("001");
		}
		else if (n == 10)
		{
			System.out.print("01");
		}
		else
		{
			if (n / 1000 > 0)
			{
				a = n % 10;
				b = ((n - a) / 10) % 10;
				 c = ((n - a - b * 10) / 100) % 10;
				d = n / 1000;
				s = a * 1000 + b * 100 + c * 10 + d;
				System.out.printf("%d",s);
			}
			else
			{
				if (n / 100 > 0)
				{
					a = n % 10;
					b = ((n - a) / 10) % 10;
					c = n / 100;
					s = a * 100 + b * 10 + c;
					System.out.printf("%d",s);
				}
				else
				{
					if (n / 10 > 0)
					{
						a = n % 10;
						b = n / 10;
						s = a * 10 + b;
						System.out.printf("%d",s);
					}
					else
					{
						System.out.printf("%d",n);
					}
				}
			}
		}
		return 0;
	}


}

