package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		for (a = 0; a < 3; a++)
		{
			for (b = 0; b < 3; b++)
			{
				for (c = 0; c < 3; c++)
				{
					A = (b > a) + (c == a);
					B = (a > b) + (a > c);
					C = (c > b) + (b > a);
					if (a >= b != 0 && a >= c != 0 && A <= B != 0 && A <= C != 0 && b >= c != 0 && B <= C)
					{
						System.out.print("ABC");
						System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
					if (a >= b != 0 && a >= c != 0 && A <= B != 0 && A <= C != 0 && b <= c != 0 && B >= C)
					{
						System.out.print("ACB");
						System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
					if (a <= b != 0 && a <= c != 0 && A >= B != 0 && A >= C != 0 && b >= c != 0 && B <= C)
					{
						System.out.print("BCA");
						System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
					if (a <= b != 0 && a <= c != 0 && A >= B != 0 && A >= C != 0 && b <= c != 0 && B >= C)
					{
						System.out.print("CBA");
						System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
					if (c >= a != 0 && c >= b != 0 && C <= A != 0 && C <= B != 0 && a >= b != 0 && A <= B)
					{
						System.out.print("CAB");
						System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
					if (b >= a != 0 && b >= c != 0 && B <= A != 0 && B <= C != 0 && a >= c != 0 && A <= C)
					{
						System.out.print("BAC");
						System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop :
		return 0;
	}
}
