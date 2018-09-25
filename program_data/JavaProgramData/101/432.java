package <missing>;

public class GlobalMembers
{
	//???????
	//?  ????
	//?  ??2011.10.12
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		int t;
		int k;
		char ch1;
		char ch2;
		char ch3;
		for (A = 1; A < 4; A++)
		{
			for (B = 1; B < 4; B++)
			{
				for (C = 1; C < 4; C++)
				{
					a = (B > A) + (C == A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					if ((((A > B) && (a < b)) || ((A == B) && (a == b)) || ((A < B) && (a > b))) + (((B > C) && (b < c)) || ((B == C) && (b == c)) || ((B < C) && (b > c))) + (((C > A) && (c < a)) || ((C == A) && (c == a)) || ((C < A) && (c > a))) == 3)
					{
						/*if (A <= B)
							t = A; A = B; B = t;
						if (B <= C)
							t = B; B = C; C = t;
						if (A <= C)
							t = A; A = C; C = t;*/
					   //ch1 = A + 64; ch2 = B + 64; ch3 = C + 64;
					   //cout << ch1 << ch2 << ch3 << endl;
						for (k = 1; k <= 3; k++)
						{
							if (A == k)
							{
								System.out.print("A");
							}
							if (B == k)
							{
								System.out.print("B");
							}
							if (C == k)
							{
								System.out.print("C");
							}
						}
					   System.out.print("\n");
					   return 0;
					}
				}
			}
		}


	}
}
