package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int A;
		int B;
		int C;
		int D;
		int E;

		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				for (c = 1;c <= 5;c++)
				{
					for (d = 1;d <= 5;d++)
					{
						for (e = 1;e <= 5;e++)
						{
						if ((a == b) || (a == c) || (a == d) || (a == e) || (b == c) || (b == d) || (b == e) || (c == d) || (c == e) || (d == e))
						{
							continue;
						}
						if ((e == 2) || (e == 3))
						{
							continue;
						}
						A = (e == 1);
						B = (b == 2);
						C = (a == 5);
						D = (c != 1);
						E = (d == 1);
						if ((A + B + C + D + E) != 2)
						{
							continue;
						}
						if ((a * A + b * B + c * C + d * D + e * E) >= 4)
						{
							continue;
						}
						System.out.print(a);
						System.out.print(" ");
						System.out.print(b);
						System.out.print(" ");
						System.out.print(c);
						System.out.print(" ");
						System.out.print(d);
						System.out.print(" ");
						System.out.print(e);
						return 0;
						}
					}
				}
			}
		}
	}
}
