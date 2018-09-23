package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int As;
		int Bs;
		int Cs;
		int m;
		int n;
		int p;
		for (A = 1;A <= 3;A = A + 1)
		{
			for (B = 1;B <= 3;B = B + 1)
			{
				for (C = 1;C <= 3;C = C + 1)
				{
					As = (B > A) + (C == A);
					Bs = (A > B) + (A > C);
					Cs = (C > B) + (B > A);
					if (!(A <= B != 0 && As <= Bs != 0 || A <= C != 0 && As <= Cs != 0 || B <= A != 0 && Bs <= As != 0 || B <= C != 0 && Bs <= Cs != 0 || C <= A != 0 && Cs <= As != 0 || C <= B != 0 && Cs <= Bs))
					{
						m = A;
						n = B;
						p = C;
					}
				}
			}
		}
		if (m >= n != 0 && n >= p)
		{
			System.out.print("CBA");
			System.out.print("\n");
		}
		if (m >= p != 0 && p >= n)
		{
			System.out.print("BCA");
			System.out.print("\n");
		}
		if (n >= m != 0 && m >= p)
		{
			System.out.print("CAB");
			System.out.print("\n");
		}
		if (n >= p != 0 && p >= m)
		{
			System.out.print("ACB");
			System.out.print("\n");
		}
		if (p >= m != 0 && m >= n)
		{
			System.out.print("BAC");
			System.out.print("\n");
		}
		if (p >= n != 0 && n >= m)
		{
			System.out.print("ABC");
			System.out.print("\n");
		}
		return 0;
	}
}
