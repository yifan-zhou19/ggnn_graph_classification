package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int i = 3;
	int[] s = new int[3];
	for (A = 1;A <= 3;A++)
	{
		for (B = 1;B <= 3;B++)
		{
			for (C = 1;C <= 3;C++)
			{
					s[0] = (B > A) + (C == A);
				s[1] = (A > B) + (A > C);
				s[2] = (C > B) + (B > A);
				if ((s[0] != s[1] && s[1] != s[2] && s[0] != s[2]) && (A != B && B != C && C != A) && (A + s[0] == B + s[1] && B + s[1] == C + s[2]))
				{
				for (i = 1;i <= 3;i++)

				{
					if (A == i)
					{
						System.out.print("A");
					}
				else if (B == i)
				{
					System.out.print("B");
				}
				else
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
