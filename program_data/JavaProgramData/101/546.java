package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  String q = new String(new char[3]);
		  for (a = 0;a < 3;a++)
		  {
						  for (b = 0;b < 3;b++)
						  {
										  for (c = 0;c < 3;c++)
										  {
														  if ((((b > a) + (c == a) + a) == 2) && (((a > b) + (a > c) + b) == 2) && (((c > b) + (b > a) + c) == 2) && (a != b) && (b != c) && (c != a))
														  {
														  q = tangible.StringFunctions.changeCharacter(q, a, 'A');
														  q = tangible.StringFunctions.changeCharacter(q, b, 'B');
														  q = tangible.StringFunctions.changeCharacter(q, c, 'C');
														  System.out.printf("%c%c%c",q.charAt(0),q.charAt(1),q.charAt(2));
														  }
										  }
						  }
		  }
	}

}

