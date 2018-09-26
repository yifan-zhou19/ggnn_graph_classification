package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int n1;
		int n2;
		int n3;
		int n4;

		for (a = 10;a <= 50;a += 10)
		{
			for (b = 10;b <= 50;b += 10)
			{
				for (c = 10;c <= 50;c += 10)
				{
					for (d = 10;d <= 50;d += 10)
					{
					if ((a + b) == (c + d) && (a + d) > (b + c) && (a + c) < b)
					{
						n1 = a > b != 0?a:b;
						n2 = c > d != 0?c:d;
						n1 = n1 > n2 != 0?n1:n2;
						n2 = 40;
						n3 = a < b != 0?a:b;
						n4 = c < d != 0?c:d;
						n3 = n3 > n4 != 0?n3:n4;
						n4 = n3 < n4 != 0?n3:n4;

						if (n1 == a)
						{
						System.out.printf("z %d\n",n1);
						}
						if (n1 == b)
						{
						System.out.printf("q %d\n",n1);
						}
						if (n1 == c)
						{
						System.out.printf("s %d\n",n1);
						}
						if (n1 == d)
						{
						System.out.printf("l %d\n",n1);
						}

						 if (n2 == a)
						 {
						System.out.printf("z %d\n",n2);
						 }
						if (n2 == b)
						{
						System.out.printf("q %d\n",n2);
						}
						if (n2 == c)
						{
						System.out.printf("s %d\n",n2);
						}
						if (n2 == d)
						{
						System.out.printf("l %d\n",n2);
						}

						 if (n3 == a)
						 {
						System.out.printf("z %d\n",n3);
						 }
						if (n3 == b)
						{
						System.out.printf("q %d\n",n3);
						}
						if (n3 == c)
						{
						System.out.printf("s %d\n",n3);
						}
						if (n3 == d)
						{
						System.out.printf("l %d\n",n3);
						}

						 if (n4 == a)
						 {
						System.out.printf("z %d\n",n4);
						 }
						if (n4 == b)
						{
						System.out.printf("q %d\n",n4);
						}
						if (n4 == c)
						{
						System.out.printf("s %d\n",n4);
						}
						if (n4 == d)
						{
						System.out.printf("l %d\n",n4);
						}

					}
					}
				}
			}
		}

		return 0;

	}

}
