package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[256]);
	  String b = new String(new char[256]);
	  String c = new String(new char[256]);
	  String d = new String(new char[256]);
	  String e = new String(new char[256]);
	  int i;
	  int j;
	  int p;
	  a = new Scanner(System.in).nextLine();
	  b = new Scanner(System.in).nextLine();
	  c = new Scanner(System.in).nextLine();
	  for (i = 0;i <= a.length() - b.length();i++)
	  {
		 p = 0;

		 for (j = i;j < i + b.length();j++)
		 {
		   if (b.charAt(j - i) == a.charAt(j))
		   {
			p++;
		   }
		 }

		 if (p == b.length())
		 {
		   d = tangible.StringFunctions.changeCharacter(d, i, '\0');
		   break;
		 }
		 d = tangible.StringFunctions.changeCharacter(d, i, a.charAt(i));
	  }
	  if (i == a.length() - b.length() + 1)
	  {
	  System.out.println(a);
	  }
	  else
	  {
	  d += c;

	  for (j = i + b.length();j < a.length();j++)
	  {
	  e = tangible.StringFunctions.changeCharacter(e, j - i - b.length(), a.charAt(j));
	  }
	  e = tangible.StringFunctions.changeCharacter(e, j - i - b.length(), '\0');
	  d += e;
	  System.out.printf("%s",d);
	  }
		return 0;
	}
}

