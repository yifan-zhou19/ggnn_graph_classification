package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[] words = new int[4];
		for (a = 1 ; a <= 3 ; a++) //???A?B?C????????1?2?3???
		{
			 for (b = 1 ; b <= 3 ; b++)
			 {
				  if (b != a)
				  {
					  c = 6 - a - b; //c???a?b???????????6
					  words[a] = (b > a) + (c == a);
					  words[b] = (a > b) + (a > c);
					  words[c] = (c > b) + (b > a);

					  if (words[1] > words[2] && words[2] > words[3]) //?????????????a?b?c?????????????
					  {
						  String person = new String(new char[4]);
						  person = null;
						  person = tangible.StringFunctions.changeCharacter(person, a, 'A'); //?????????????
						  person = tangible.StringFunctions.changeCharacter(person, b, 'B');
						  person = tangible.StringFunctions.changeCharacter(person, c, 'C');
						  System.out.print(person.charAt(1));
						  System.out.print(person.charAt(2));
						  System.out.print(person.charAt(3));
						  break;
					  }
				  }
			 }
		}
	return 0;
	}
}

