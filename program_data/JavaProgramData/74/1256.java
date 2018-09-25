package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int g;
		int s;
		int b;
		int q;
		int w;
		int judge = 0;
		int j;
		int count;
		int temp;
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
		for (i = (m - 1 - (m % 2));i <= n;i += 2)
		{
			w = i / 10000;
			if (i >= 10000 && i < 20000)
			{
				w = 1;
			}
			q = (i - 10000 * w) / 1000;
			b = (i - 10000 * w - 1000 * q) / 100;
			s = (i - 10000 * w - 1000 * q - 100 * b) / 10;
			g = i - 10000 * w - 1000 * q - 100 * b - 10 * s;
			if (w == 0 && q != 0)
			{
				temp = 1000 * g + 100 * s + 10 * b + q;
			}
			if (q == 0 && b != 0 && w == 0)
			{
				temp = 100 * g + 10 * s + b;
			}
			if (b == 0 && s != 0 && q == 0 && w == 0)
			{
				temp = 10 * g + s;
			}
			if (w != 0)
			{
				temp = 10000 * g + 1000 * s + 100 * b + 10 * q + w;
			}
			if (temp == i)
			{
				count = 0;
				for (j = 1;j <= i;j++)
				{
					if (i % j == 0)
					{
						count += 1;
					}
				}
				if (count == 2)
				{
					judge += 1;
					if (judge == 1)
					{
						System.out.printf("%d", i);
					}
					else
					{
						System.out.printf(",%d", i);
					}
				}
			}
		}
		if (judge == 0)
		{
			System.out.print("no");
		}
		return 0;
	}




}

