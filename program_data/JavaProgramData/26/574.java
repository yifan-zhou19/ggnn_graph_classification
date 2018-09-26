package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i = 0;
	  int j = 0;
	  int k;
	  int x = 0;
	  int y;
	  String a = new String(new char[101]);
	  String b = new String(new char[101]);
	  a = new Scanner(System.in).nextLine();
	  k = a.length();
	  for (i = 0;i < k;i++)
	  {
		if (a.charAt(i) != ' ')
		{
		  b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
		  j++;
		  x = 0;
		}
		else
		{
		 if (x == 0)
		 {
		 b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
		 j++;
		 x = 1;
		 }

		}
	  }
	  b = tangible.StringFunctions.changeCharacter(b, j, '\0');
	  int n = 0;
	  n = b.length();
	  for (i = 0;i < n;i++)
	  {
	  System.out.printf("%c",b.charAt(i));
	  }
	  System.in.read();
	  System.in.read();
	}

}

