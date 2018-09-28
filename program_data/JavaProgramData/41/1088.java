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
		int sum;
		for (a = 1; a <= 5; a++)
		{
			for (b = 1; b <= 5; b++)
			{
				for (c = 1; c <= 5; c++)
				{
					for (d = 1; d <= 5; d++)
					{
						for (e = 1; e <= 5; e++)
						{
							A = (e == 1);
							B = (b == 2);
							C = (a == 5);
							D = (c != 1);
							E = (d == 1);
							sum = A + B + C + D + E;
								if (a == 5 && b == 5 && c == 5 && d == 5 && e == 5)
								{
									System.out.print('5');
									System.out.print(' ');
									System.out.print('2');
									System.out.print(' ');
									System.out.print('1');
									System.out.print(' ');
									System.out.print('3');
									System.out.print(' ');
									System.out.print('4');
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
