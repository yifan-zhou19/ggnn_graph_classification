package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a; //??A`B`C????a`b`c,???0-2
	  int b;
	  int c;
	  String S = new String(new char[3]); //??????S???
	  for (a = 0;a < 3;a++) //????a`b`c??
	  {
		for (b = 0;b < 3;b++)
		{
		  for (c = 0;c < 3;c++)
		  {
			int x = 2; //??????A`B`C?????
			int y = 2;
			int z = 2;
			if (b > a) //???????,???????,???????????1
			{
			  x = x - 1;
			  z = z - 1;
			}
			if (a == c)
			{
			  x = x - 1;
			}
			if (b < a)
			{
			  y = y - 1;
			}
			if (a > c)
			{
			  y = y - 1;
			}
			if (c > b)
			{
			  z = z - 1;
			}
			if (a == x && b == y && c == z) //???????????????
			{
			   S = tangible.StringFunctions.changeCharacter(S, a, 'A'); //???????????A`B`C??S[3]
			   S = tangible.StringFunctions.changeCharacter(S, b, 'B');
		   S = tangible.StringFunctions.changeCharacter(S, c, 'C');
			}
		  }
		}
	  }
	  System.out.print(S.charAt(0));
	  System.out.print(S.charAt(1));
	  System.out.print(S.charAt(2));
	  return 0;
	}
}

