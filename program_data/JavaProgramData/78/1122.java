package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int A;
		int B;
		for (a = 10 ;a <= 40; a += 10)
		{
			for (b = 40 ; b <= 50 ; b += 10)
			{
				for (c = 10 ; c <= 40 ; c += 10)
				{
					d = a + b - c;
					A = (a + d) > (b + c);
					B = (a + c) < b;
					if (A + B == 2 && a != b && a != c && b != c && d <= 50)
					{
						if (b < d)
						{
							if (a < c)
							{
						System.out.print("l ");
						System.out.print(d);
						System.out.print("\n");
						System.out.print("q ");
						System.out.print(b);
						System.out.print("\n");
						System.out.print("s ");
						System.out.print(c);
						System.out.print("\n");
						System.out.print("z ");
						System.out.print(a);
						System.out.print("\n");
							}
							else
							{
						System.out.print("l ");
						System.out.print(d);
						System.out.print("\n");
						System.out.print("q ");
						System.out.print(b);
						System.out.print("\n");
						System.out.print("z ");
						System.out.print(a);
						System.out.print("\n");
						System.out.print("s ");
						System.out.print(c);
						System.out.print("\n");
							}
						}
						else
						{
							if (a < c && c < d)
							{
						System.out.print("q ");
						System.out.print(b);
						System.out.print("\n");
						System.out.print("l ");
						System.out.print(d);
						System.out.print("\n");
						System.out.print("s ");
						System.out.print(c);
						System.out.print("\n");
						System.out.print("z ");
						System.out.print(a);
						System.out.print("\n");
							}
							if (a < d && d < c)
							{
						System.out.print("q ");
						System.out.print(b);
						System.out.print("\n");
						System.out.print("s ");
						System.out.print(c);
						System.out.print("\n");
						System.out.print("l ");
						System.out.print(d);
						System.out.print("\n");
						System.out.print("z ");
						System.out.print(a);
						System.out.print("\n");
							}
							if (c < a && a < d)
							{
						System.out.print("q ");
						System.out.print(b);
						System.out.print("\n");
						System.out.print("l ");
						System.out.print(d);
						System.out.print("\n");
						System.out.print("z ");
						System.out.print(a);
						System.out.print("\n");
						System.out.print("s ");
						System.out.print(c);
						System.out.print("\n");
							}
							if (c < d && d < a)
							{
						System.out.print("q ");
						System.out.print(b);
						System.out.print("\n");
						System.out.print("z ");
						System.out.print(a);
						System.out.print("\n");
						System.out.print("l ");
						System.out.print(d);
						System.out.print("\n");
						System.out.print("s ");
						System.out.print(c);
						System.out.print("\n");
							}



						}
					}
				}
			}
		}




	   return 0;
	}
}
