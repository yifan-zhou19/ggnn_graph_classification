package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 10)
		{
			System.out.printf("%d",n);
		}
		else
		{
			if (n < 100)
			{
				int a;
				int b;
			a = n % 10;
			b = (n - a) / 10;
			System.out.printf("%d%d",a,b);
			}
			else
			{
				if (n < 1000)
				{
					int c;
					int d;
					int e;
				c = n % 10;
				d = (n - c) / 10 % 10;
				e = (n - 10 * d - c) / 100;
				System.out.printf("%d%d%d",c,d,e);
				}
					else
					{
						int f;
						int g;
						int h;
						int i;
						f = n % 10;
					g = (n - f) / 10 % 10;
					h = (n - f - 10 * g) / 100 % 10;
					i = (n - f - 10 * g - 100 * h) / 1000;
					System.out.printf("%d%d%d%d",f,g,h,i);
					}
			}
		}

	}

}

