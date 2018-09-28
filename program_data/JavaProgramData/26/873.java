package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[101]);
	  String b = new String(new char[101]);
	  int i;
	  int k = 0;
	  int len;
	  a = new Scanner(System.in).nextLine();
	  len = a.length();
	  for (i = 0;i < len;i++)
	  {
		if (!(a.charAt(i) == ' ' && a.charAt(i + 1) == ' '))
		{
			  b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
			  k++;
		}
	  }
	  b = tangible.StringFunctions.changeCharacter(b, k, '\0');
	  System.out.printf("%s",b);
	  return 0;
	}
}

