package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int ra;
		int rb;
		int rc;
		int m;
		int n;
		int l;
		char p;
		char q;
		char r;
		for (ra = 0; ra <= 2; ra++)
		{
			for (rb = 0; rb <= 2; rb++)
			{
				for (rc = 0; rc <= 2; rc++)
				{
					A = (rb > ra) + (rc == ra); //??A???
					B = (ra > rb) + (ra > rc); //??B???
					C = (rc > rb) + (rb == ra); //??C???
					if (A + B + C == 3)
					{
						if ((A > B) && (A > C))
						{
							if (B > C)
							{
								System.out.print("ABC");
								System.out.print("\n");
							}
							else
							{
								System.out.print("ACB");
								System.out.print("\n");
							}
						}
						else if ((B > A) && (B > C))
						{
							if (A > C)
							{
								System.out.print("BAC");
								System.out.print("\n");
							}
							else
							{
								System.out.print("BCA");
								System.out.print("\n");
							}
						}
						else if ((C > A) && (C > B))
						{
							m = C;
							if (A > B)
							{
								System.out.print("CAB");
								System.out.print("\n");
							}
							else
							{
								System.out.print("CBA");
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
