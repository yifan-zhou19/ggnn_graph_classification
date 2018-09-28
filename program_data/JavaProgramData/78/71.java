package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int Wz;
	   int Wq;
	   int Ws;
	   int Wl;
	   int i;
	   int j;
	   String rank = new String(new char[6]);
	   for (Wz = 1;Wz <= 5;Wz++)
	   {
		  for (Wq = 1;Wq <= 5;Wq++)
		  {
			 for (Ws = 1;Ws <= 5;Ws++)
			 {
				for (Wl = 1;Wl <= 5;Wl++)
				{
				   if ((Wz + Wq == Ws + Wl) && (Wz + Wl > Ws + Wq) && (Wz + Ws < Wq))
				   {
					   rank = tangible.StringFunctions.changeCharacter(rank, Wz, 'z');
					   rank = tangible.StringFunctions.changeCharacter(rank, Wq, 'q');
					   rank = tangible.StringFunctions.changeCharacter(rank, Ws, 's');
					   rank = tangible.StringFunctions.changeCharacter(rank, Wl, 'l');
					   for (i = 5;i >= 1;i--)
					   {
						  if (rank.charAt(i) == '\0')
						  {
						  continue;
						  }
						  else
						  {
							  System.out.print(rank.charAt(i));
							  System.out.print(' ');
							  System.out.print(i * 10);
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

