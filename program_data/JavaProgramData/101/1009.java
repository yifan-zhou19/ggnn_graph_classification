package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int c1;
		int c2;
		int c3;
		for (A = 1;A <= 3;A = A + 1)
		{
			for (B = 1;B <= 3;B = B + 1)
			{
				for (C = 1;C <= 3;C = C + 1)
				{
					c1 = (B > A) + (C + A);
					c2 = (A > B) + (A > C);
					c3 = (C > B) + (B > A);
					if (A + c1 == B + c2 == C + c3 == 3)
					{
						break;
					}
				}
			}
		}
		if (A > B)
		{
			if (B > C)
			{
				System.out.print("ABC");
				System.out.print("\n");
			}
			else if (C > A)
			{
				System.out.print("CAB");
				System.out.print("\n");
			}
			else
			{
				System.out.print("ACB");
				System.out.print("\n");
			}
		}
		else
		{
			if (A > C)
			{
				System.out.print("BAC");
				System.out.print("\n");
			}
			else if (C > B)
			{
				System.out.print("CBA");
				System.out.print("\n");
			}
			else
			{
				System.out.print("BCA");
				System.out.print("\n");
			}
		}
		return 0;
	}

}
