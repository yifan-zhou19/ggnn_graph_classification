package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[65535]);
	  String b = new String(new char[65535]);
	  a = new Scanner(System.in).nextLine();
	  int l = a.length();
	  b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
	  for (int i = 1,k = 1;a.charAt(i) != '\0';i++)
	  {
		if (a.charAt(i - 1) == ' ' && a.charAt(i) == ' ')
		{
		}
		else
		{
			b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
		k++;
		}
	  }
	  System.out.println(b);

	  System.in.read();
	  System.in.read();
	}

}

