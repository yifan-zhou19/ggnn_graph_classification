package <missing>;

public class GlobalMembers
{
	/*3??????????????
	A??B??????C???????
	B??A??????A??C???
	C????B????B?A????
	?????????????????????
	???????????3?????*/

	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		int x;
		int y;
		int z;
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				for (C = 1;C <= 3;C++)
				{
					a = (B > A) + (C == A);
					b = (A > B) + (A > C);
					c = (C > B) + (B > A);
					x = (a > b) && (A < B) || (a == b) && (A == B) || (a < b) && (A> B);
					y = (a > c) && (A < C) || (a == c) && (A == C) || (a < c) && (A> C);
					z = (c > b) && (C < B) || (c == b) && (C == B) || (c < b) && (C> B);
					if (x + y + z == 3)
					{
						for (int i = 1;i <= 3;i++)
						{
							if (i == A)
							{
								System.out.print("A");
							}
							if (i == B)
							{
								System.out.print("B");
							}
							if (i == C)
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
