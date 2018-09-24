package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int afan; //afan?bfan?cfan??????????? ,aword,bword,cword??????
		int bfan;
		int cfan;
		int i;
		int aword;
		int bword;
		int cword;
		String rank = new String(new char[4]); //????
		for (afan = 1;afan <= 3;afan++)
		{
		   for (bfan = 1;bfan <= 3;bfan++)
		   {
			  if (afan == bfan)
			  {
				  continue; //??????
			  }
				 for (cfan = 1;cfan <= 3;cfan++)
				 {
										  if ((afan == cfan) || (bfan == cfan))
										  {
											  continue;
										  }
										  aword = (bfan < afan) + (cfan == afan) + 1;
										  bword = (afan < bfan) + (afan < cfan) + 1;
										  cword = (cfan < bfan) + (bfan < afan) + 1;
										  if ((afan == aword) + (bfan == bword) + (cfan == cword) == 3)
										  {
												rank = tangible.StringFunctions.changeCharacter(rank, afan, 'A');
												rank = tangible.StringFunctions.changeCharacter(rank, bfan, 'B');
												rank = tangible.StringFunctions.changeCharacter(rank, cfan, 'C');
										  }
				 }
		   }
		}
		for (i = 3;i > 0;i--)
		{
			System.out.print(rank.charAt(i));
		}
		return 0;
	}

}

