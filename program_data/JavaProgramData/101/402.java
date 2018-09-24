package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int As;
	  int Bs;
	  int Cs;
	  int Aans;
	  int Bans;
	  int Cans;
	  for (i = 0;i < 3;i++)
	  {
		for (j = 0;j < 3;j++)
		{
		  for (k = 0;k < 3;k++)
		  {
			  if (!((i <= j != 0 && As <= Bs) || (i <= k != 0 && As <= Cs) || (j <= i != 0 && Bs <= As) || (j <= k != 0 && Bs <= Cs) || (k <= i != 0 && Cs <= As) || (k <= j != 0 && Cs <= Bs)))
			  {
					Aans = i;
				  Bans = j;
				  Cans = k;
			  }
		  }
		}
	  }
		  if ((Aans >= Bans) && (Bans >= Cans))
		  {
			  System.out.print("ABC");
			  System.out.print("\n");
		  }
		  if ((Aans >= Cans) && (Cans >= Bans))
		  {
			  System.out.print("ACB");
			  System.out.print("\n");
		  }
			   if ((Bans >= Aans) && (Aans >= Cans))
			   {
			  System.out.print("BAC");
			  System.out.print("\n");
			   }
		  if ((Bans >= Cans) && (Cans >= Aans))
		  {
						System.out.print("BCA");
						System.out.print("\n");
		  }
			   if ((Cans >= Aans) && (Aans >= Bans))
			   {
						System.out.print("CAB");
						System.out.print("\n");
			   }
			   if ((Cans >= Bans) && (Bans >= Aans))
			   {
						System.out.print("CBA");
						System.out.print("\n");
			   }
	return 0;
	}

}
