package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int x;
		int y;
		int z;
		int o;
		int p;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		len = 0;
		b = a;
	while (b > 0)
	{
			b = b / 10;
			len++;
	}
			if (len == 1)
			{
				System.out.printf("%d%",a);
			}

			else if (len == 2)
			{
				x = a / 10;
			y = a - 10 * x;
			System.out.printf("%d",10 * y + x);
			}
			else if (len == 3)
			{
				x = a / 100;
				y = (a - x * 100) / 10;
				z = a - 100 * x - 10 * y;
				System.out.printf("%d",z * 100 + y * 10 + x);
			}
			else if (len == 4)
			{
				x = a / 1000;
			y = (a - x * 1000) / 100;
			z = (a - x * 1000 - y * 100) / 10;
			o = a - x * 1000 - y * 100 - z * 10;
			System.out.printf("%d",o * 1000 + z * 100 + y * 10 + x);
			}
			else if (len == 5)
			{
				x = a / 10000;
				y = (a - x * 10000) / 1000;
				z = (a - x * 10000 - y * 1000) / 100;
				o = (a - x * 10000 - y * 1000 - z * 100) / 10;
				p = a - x * 10000 - y * 1000 - z * 100 - o * 10;
				System.out.printf("%d",p * 10000 + o * 1000 + z * 100 + y * 10 + x);
			}

	}

}

