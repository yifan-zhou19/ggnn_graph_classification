package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 10000)
		{
			a = n / 10000;
			b = (n - 10000 * a) / 1000;
			c = (n - 10000 * a - 1000 * b) / 100;
			d = (n - 10000 * a - 1000 * b - 100 * c) / 10;
			e = n % 10;
			m = 10000 * e+1000 * d + 100 * c + 10 * b + a;
		}
			else if (n >= 1000)
			{
				b = n / 1000;
				c = (n - 1000 * b) / 100;
				d = (n - 1000 * b - 100 * c) / 10;
				e = n % 10;
				m = 1000 * e+100 * d + 10 * c + b;

			}
				else if (n >= 100)
				{

					c = (n) / 100;
					d = (n - 100 * c) / 10;
					e = n % 10;
					m = 100 * e+10 * d + c;

				}
					else if (n >= 10)
					{

						d = n / 10;
						e = n % 10;
						m = 10 * e + d;

					}
					else
					{
						m = n;
					}

		System.out.printf("%d\n",m);
	}
}

