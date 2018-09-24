package <missing>;

public class GlobalMembers
{
	/**
	  *file  ???
	  *author ???
	  *date   11.17
	  *function 3?????????????? 
				A??B??????C??????? 
				B??A??????A??C??? 
				C????B????B?A???? 
				????????????????????? 
				???????????3??????
	*/
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int A;
		int B;
		int C;
		for (A = 0; A <= 2; A++)
		{
			for (B = 0; B <= 2; B++)
			{
				if (B == A)
				{
					continue;
				}
				else
				{
					for (C = 0; C <= 2; C++)
					{
						if (C == A || C == B)
						{
							continue;
						}
						else
						{
							a = (B > A) + (A == C);
							b = (A > B) + (A > C);
							c = (C > B) + (B > A);
							if (a + A == 2 && b + B == 2 && c + C == 2)
							{
								if (A > B > C)
								{
									System.out.print("CBA");
									System.out.print("\n");
								}
								if (A > C > B)
								{
									System.out.print("BCA");
									System.out.print("\n");
								}
								if (B > A > C)
								{
									System.out.print("CAB");
									System.out.print("\n");
								}
								if (B > C > A)
								{
									System.out.print("ACB");
									System.out.print("\n");
								}
								if (C > B > A)
								{
									System.out.print("CBA");
									System.out.print("\n");
								}
								if (C > A > B)
								{
									System.out.print("BCA");
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
