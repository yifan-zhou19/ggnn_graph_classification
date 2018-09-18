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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 10000)
		{
			n = 00001;
		}
		else
		{
			if (n >= 1000)
			{
				a = n % 10;
				b = (n - a) % 100 / 10;
				d = n / 1000;
				c = n / 100 - d * 10;
				System.out.printf("%d",a);
				System.out.printf("%d",b);
				System.out.printf("%d",c);
				System.out.printf("%d",d);
			}
			else
			{
				if (n >= 100)
				{
					a = n % 10;
					b = (n - a) % 100 / 10;
					c = n / 100;
					System.out.printf("%d",a);
					System.out.printf("%d",b);
					System.out.printf("%d",c);
				}
				else
				{
					if (n >= 10)
					{
						a = n % 10;
						b = n / 10;
						System.out.printf("%d",a);
						System.out.printf("%d",b);
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

