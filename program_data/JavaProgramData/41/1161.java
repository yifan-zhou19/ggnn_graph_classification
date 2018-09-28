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
		int cnt1;
		int cnt2;
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
							cnt1 = (a == A) + (b == B) + (c == C) + (d == D) + (e == E);
							cnt2 = (a - 1 == A) + (b - 1 == B) + (c - 1 == C) + (d - 1 == D) + (e-1 == E);
							sum = A + B + C + D + E;
							if (sum == 2 && a != b && a != c && a != d && a != e && b != c && b != d && b != e && c != d && c != e && d != e && cnt1 == 1 && e != 2 && e != 3 && cnt2 == 1)
							{
								System.out.print(a);
								System.out.print(' ');
								System.out.print(b);
								System.out.print(' ');
								System.out.print(c);
								System.out.print(' ');
								System.out.print(d);
								System.out.print(' ');
								System.out.print(e);
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
