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
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 10000)
		{
			System.out.print("00001");
			System.out.print("\n");
		}
		else
		{
			if (n / 1000 >= 1)
			{
				a = n / 1000;
				b = (n - a * 1000) / 100;
				c = (n - a * 1000 - b * 100) / 10;
				d = n - a * 1000 - b * 100 - c * 10;
				System.out.print(d);
				System.out.print(c);
				System.out.print(b);
				System.out.print(a);
				System.out.print("\n");
			}
			else
			{
				if (n / 100 >= 1)
				{
				   b = n / 100;
				   c = (n - b * 100) / 10;
					d = n - b * 100 - c * 10;
				  System.out.print(d);
				  System.out.print(c);
				  System.out.print(b);
				  System.out.print("\n");
				}
				else
				{
					if (n / 10 >= 1)
					{
					  c = n / 10;
						d = n - c * 10;
					   System.out.print(d);
					   System.out.print(c);
					   System.out.print("\n");
					}
					else
					{
						System.out.print(n);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}


}

