package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int a1;
		int b1;
		int c1;
		int i;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					a1 = (b > a) + (c == a);
					b1 = (a > b) + (a > c);
					c1 = (c > b) + (b > a);
				if ((a + a1) == (b + b1) && (a + a1) == (c + c1))
				{
					for (i = 1;i <= 3;i++)
					{
					if (a == i)
					{
					System.out.print("A");
					}
					if (b == i)
					{
					System.out.print("B");
					}
					if (c == i)
					{
					System.out.print("C");
					}
					}



				}
				}

			}
		}
		return 0;
	}
}
