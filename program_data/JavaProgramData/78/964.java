package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		for (a = 10;a <= 50;a += 10)
		{
			for (b = 10;b <= 50;b += 10)
			{
				for (c = 10;c <= 50;c += 10)
				{
					for (d = 10;d <= 50;d += 10)
					{
						if ((a + b == c + d) && (a + d > b + c) && (a + c < b))
						{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto loop;
						}
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (int i = 1;i <= 4;i++)
	{
				int max = 10;
				if (a > max)
				{
					max = a;
				}
				if (b > max)
				{
					max = b;

				}
				if (c > max)
				{
					max = c;

				}
				if (d > max)
				{
					max = d;

				}
				if (a == max)
				{
					System.out.print("z ");
					System.out.print(a);
					System.out.print("\n");
					a = 0;
				}
				if (b == max)
				{
					System.out.print("q ");
					System.out.print(b);
					System.out.print("\n");
					b = 0;
				}
				if (c == max)
				{
					System.out.print("s ");
					System.out.print(c);
					System.out.print("\n");
					c = 0;
				}
				if (d == max)
				{
					System.out.print("l ");
					System.out.print(d);
					System.out.print("\n");
					d = 0;
				}
	}



	}

}
