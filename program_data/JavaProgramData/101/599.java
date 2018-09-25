package <missing>;

public class GlobalMembers
{
	//3?????????????? 
	//A??B??????C??????? 
	//B??A??????A??C??? 
	//C????B????B?A???? 
	//????????????????????? 
	//???????????3??????
	public static int Main()
	{
	  int a = 1;
	  int b = 1;
	  int c = 1;
	  int i = 1;
	  String rank = new String(new char[4]);
	  for (a = 1;a <= 3;a++) //the most the first
	  {
		 for (b = 1;b <= 3;b++)
		 {
			 for (c = 1;c <= 3;c++)
			 {
				if (((b < a) + (c == a) == (a - 1)) && ((a < b) + (a < c) == (b - 1)) && ((c < b) + (b < a) == (c - 1)))
				{
						rank = tangible.StringFunctions.changeCharacter(rank, a, 'A');
					   rank = tangible.StringFunctions.changeCharacter(rank, b, 'B');
					   rank = tangible.StringFunctions.changeCharacter(rank, c, 'C');
					for (i = 3;i >= 1;i--)
					{
						System.out.print(rank.charAt(i));
					}
				}
			 }

		 }
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}
}

