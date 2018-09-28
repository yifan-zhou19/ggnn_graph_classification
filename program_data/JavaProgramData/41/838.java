package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0; //?????????????????????????
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int E = 0;

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
						if ((e == 2) || (e == 3))
						{
							continue; //??e???2??3
						}
						if ((a == b) || (a == c) || (a == d) || (a == e) || (b == c) || (b == d) || (b == e) || (c == d) || (c == e) || (d == e))
						{
							continue;
						}
						//?????????????
						A = (e == 1);
						B = (b == 2);
						C = (a == 5);
						D = (c != 1);
						E = (d == 1);
						if ((A + B + C + D + E) != 2)
						{
							continue; //?????2????????
						}
						if ((a * A + b * B + c * C + d * D + e * E) == 3)
						{
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
						} //??????????????? ?????1??????????3
						}
					}
				}
			}
		}
		return 0;
	}
}
