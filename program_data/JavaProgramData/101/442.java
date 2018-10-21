package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int k;
		int ans;
		int bns;
		int cns;
		k = 0;
		for (A = 1; A < 4; A++)
		{
			for (B = 1; B < 4; B++)
			{
				for (C = 1; C < 4; C++)
				{
					ans = (B > A) + (C == A);
					bns = (A > B) + (A > C);
					cns = (C > B) + (B > A);

					if ((A >= B != 0 && ans >= bns) || (A >= C != 0 && ans >= cns) || (B >= C != 0 && bns >= cns) || (A <= B != 0 && ans <= bns) || (A <= C != 0 && ans <= cns) || (B <= C != 0 && bns <= cns))
					{
						continue;
					}
					else
					{
						k = 1;
					if (A <= B != 0 && B <= C)
					{
						System.out.print("ABC");
						System.out.print("\n");
					}
					else if (A <= C != 0 && C <= B)
					{
						System.out.print("ACB");
						System.out.print("\n");
					}
					else if (B <= A != 0 && A <= C)
					{
						System.out.print("BAC");
						System.out.print("\n");
					}
					else if (B <= C != 0 && C <= A)
					{
						System.out.print("BCA");
						System.out.print("\n");
					}
					else if (C <= A != 0 && A <= B)
					{
						System.out.print("CAB");
						System.out.print("\n");
					}
					else
					{
						System.out.print("CBA");
						System.out.print("\n");
					}

					break;
					}
					if (k == 1)
					{
						break;
					}
				}
				   if (k == 1)
				   {
						break;
				   }
			}
					 if (k == 1)
					 {
						break;
					 }
		}
				return 0;
	}
}
