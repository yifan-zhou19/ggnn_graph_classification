package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		for (A = 0;A <= 2;A++)
		{
			for (B = 0;B <= 2;B++)
			{
				for (C = 0;C <= 2;C++) //???ABC?0?1?2??????????
				{
					a = ((B > A) + (C == A));
					b = ((A > B) + (A > C));
					c = ((C > B) + (B > A));
					if (A + a == B + b && B + b == C + c && C + c == A + a) //??????????
					{
						for (int i = 0;i <= 2;i++)
						{
							if (A == i)
							{
								System.out.print('A');
							}
							if (B == i)
							{
								System.out.print('B');
							}
							if (C == i)
							{
								System.out.print('C');
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
