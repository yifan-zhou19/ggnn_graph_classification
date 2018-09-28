package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String C = new String(new char[500]);
		String P;
		C = new Scanner(System.in).nextLine();
		P = C;
		int L = P.length();
		for (int I = 0; I < L; I++)
		{
			if (P.charAt(I) >= '0' && P.charAt(I) <= '9')
			{
				int J;
				for (J = I; J < L; J++)
				{
					if (P.charAt(J) >= '0' && P.charAt(J) <= '9')
					{
						System.out.print(P.charAt(J));
					}
					else
					{
						break;
					}
				}
				I = J;
				System.out.print("\n");
			}
		}
	}
}
