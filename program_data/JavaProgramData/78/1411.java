package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int A;
	 int B;
	 int C;
	 int D;
	 int word;
	 int weight;
	 String rank = new String(new char[6]);
	for (int j = 0;j < 6;j++)
	{
	 rank = tangible.StringFunctions.changeCharacter(rank, j, '0');
	}
	for (A = 1; A <= 5; A++)
	{
	 for (B = 1; B <= 5; B++)
	 {
	 if (A == B)
	 {
		 continue;
	 }
	  for (C = 1; C <= 5; C++)
	  {
	  if (A == C || B == C)
	  {
		  continue;
	  }
	  for (D = 1; D <= 5; D++)
	  {
		if (A == D || B == D || C == D)
		{
			continue;
		}
	   word = ((A + B) == (C + D)) + ((A + D) > (C + B)) + ((A + C) < B);
	  if (word == 3)
	  {
		 rank = tangible.StringFunctions.changeCharacter(rank, A, 'z');
	  rank = tangible.StringFunctions.changeCharacter(rank, B, 'q');
	  rank = tangible.StringFunctions.changeCharacter(rank, C, 's');
	  rank = tangible.StringFunctions.changeCharacter(rank, D, 'l');
	 for (int j = 5;j > 0;j--)
	 {
		if (rank.charAt(j) == '0')
		{
			continue;
		}
		 else
		 {
			  System.out.print(rank.charAt(j));
			  System.out.print(" ");
		   weight = j * 10;
		   System.out.print(weight);
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

