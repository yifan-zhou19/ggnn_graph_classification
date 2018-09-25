package <missing>;

public class GlobalMembers
{
	//???
	public static int Main()
	{
		int Z = 0;
		int Q = 0;
		int S = 0;
		int L = 0;
		int i = 0;
		for (Z = 1; Z <= 5; Z++)
		{
			for (Q = 1; Q <= 5 ; Q++)
			{
				for (S = 1; S <= 5 ; S++)
				{
					for (L = 1; L <= 5 ; L++)
					{
						if (((Z + Q) == (S + L)) + ((Z + L) > (S + Q)) + ((Z + S) < Q) == 3)
						{
							for (i = 5; i >= 1; i--)
							{
								if (i == Z)
								{
									System.out.print("z ");
									System.out.print(10 * i);
									System.out.print("\n");
								}
								else if (i == Q)
								{
									System.out.print("q ");
									System.out.print(10 * i);
									System.out.print("\n");
								}
								else if (i == S)
								{
									System.out.print("s ");
									System.out.print(10 * i);
									System.out.print("\n");
								}
								else if (i == L)
								{
									System.out.print("l ");
									System.out.print(10 * i);
									System.out.print("\n");
								}
							}
							break;
						}
					}
				}
			}
		}
					return 0;
	}


}
