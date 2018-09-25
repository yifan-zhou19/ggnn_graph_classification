package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //a b c ????????????
		int b;
		int c;
		int A; //A B C ????????
		int B;
		int C;
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				for (c = 0;c <= 2;c++)
				{
					if (a == b || b == c || a == c) //?????????????????????????
					{
						continue;
					}
					A = 2 - a; //?????
					B = 2 - b;
					C = 2 - c;
					if (a == ((B > A) + (C == A))) //a????????
					{
					if (b == ((A > B) + (A > C)))
					{
					if (c == ((C > B) + (B > A)))
					{
						for (int i = 0;i <= 2;i++)
						{
							if (i == A) //????????????????????
							{
								System.out.print("A");
							}
							else if (i == B)
							{
								System.out.print("B");
							}
							else if (i == C)
							{
								System.out.print("C");
							}
						}
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
