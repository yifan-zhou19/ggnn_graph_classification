package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int k1;
		int k2;
		int k3;
			 String a = new String(new char[3]);
		for (A = 2;A >= 0;A--)
		{
			for (B = 2;B >= 0;B--)
			{
				if (A == B)
				{
					continue;
				}
				for (C = 2;C >= 0;C--)
				{
					if (A == C || B == C)
					{
						continue;
					}
					 k1 = (B > A) + (C == A);
					 k2 = (A > B) + (A > C);
					  k3 = (C > B) + (B > A);
					  if (((k1 - k2) * (A - B) < 0) + ((k1 - k3) * (A - C) < 0) + ((k2 - k3) * (B - C) < 0) == 3)
					  {
						  a = tangible.StringFunctions.changeCharacter(a, A, 'A');
						  a = tangible.StringFunctions.changeCharacter(a, B, 'B');
						  a = tangible.StringFunctions.changeCharacter(a, C, 'C');
					  System.out.print(a.charAt(0));
					  System.out.print(a.charAt(1));
					  System.out.print(a.charAt(2));
					  }
				}
			}
		}
	return 0;
	}
}

