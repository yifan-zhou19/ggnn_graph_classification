package <missing>;

public class GlobalMembers
{
	/*???
	 ???    1200012876
	 2012?10?25?9:44:36      */
	public static int Main()
	{
		int Z; //??????Z?Q?S?L
		int Q;
		int S;
		int L;
		for (Z = 10; Z <= 50; Z += 10)
		{ //Z,Q,S,L???10???50
			for (Q = 10; Q <= 50; Q += 10)
			{
				if (Z == Q)
				{
					continue; //Z?Q?????
				}
				for (S = 10; S <= 50; S += 10)
				{
					if (S == Z || S == Q)
					{
						continue; //S?Z?Q?????
					}
					for (L = 10; L <= 50; L += 10)
					{
						if (L == Z || L == S || L == Q)
						{
							continue; //L?Z?Q?S?????
						}
						if (((Z + Q) == (S + L)) + ((Z + L) > (Q + S)) + ((Z + S) < Q) == 3)
						{ //????????
							for (int i = 50; i > 0; i -= 10)
							{ //????????
								if (i == Z)
								{
									System.out.print("z ");
									System.out.print(Z);
									System.out.print("\n");
								}
								if (i == Q)
								{
									System.out.print("q ");
									System.out.print(Q);
									System.out.print("\n");
								}
								if (i == S)
								{
									System.out.print("s ");
									System.out.print(S);
									System.out.print("\n");
								}
								if (i == L)
								{
									System.out.print("l ");
									System.out.print(L);
									System.out.print("\n");
								}
							}
						}
					}
				}
			}
		}
		return 0;
	} //????

}
