package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //????a b c ????A B C?????????
		int b;
		int c;
		int A; //????A B C ????A B C??????
		int B;
		int C;
		for (A = 0 ; A < 3 ; A++)
		{
			for (B = 0 ; B < 3 ; B++)
			{
				for (C = 0 ; C < 3 ; C++) //????ABC????? ???1 2 3 ????
				{
					if (A != B && B != C && A != C) //?A B C ???????? ?????
					{
						a = (B > A) + (C == A);
						b = (A > B) + (A > C);
						c = (C > B) + (B > A);
						if (a != b && b != c && a != c)
						{
							if ((B > A) + (b >= a) == 1 && (A > C) + (a >= c) == 1 && (B > C) + (b >= c) == 1) //???????????????????
							{
								if (A > B && B > C)
								{
									System.out.print("C");
									System.out.print("B");
									System.out.print("A");
									System.out.print("\n");
								}
								else if (A > C && C > B)
								{
									System.out.print("B");
									System.out.print("C");
									System.out.print("A");
									System.out.print("\n");
								}
								else if (B > A && A > C)
								{
									System.out.print("C");
									System.out.print("A");
									System.out.print("B");
									System.out.print("\n");
								}
								else if (B > C && C > A)
								{
									System.out.print("A");
									System.out.print("C");
									System.out.print("B");
									System.out.print("\n");
								}
								else if (C > B && B > A)
								{
									System.out.print("A");
									System.out.print("B");
									System.out.print("C");
									System.out.print("\n");
								}
								else if (C > A && A > B)
								{
									System.out.print("B");
									System.out.print("A");
									System.out.print("C");
									System.out.print("\n");
								}
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
