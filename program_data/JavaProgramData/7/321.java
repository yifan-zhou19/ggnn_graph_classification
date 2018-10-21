package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[100]);
	  String d = new String(new char[100]);
	  String p;
	  String c = new String(new char[100]);
	  String c1 = new String(new char[100]);
	  String c2 = new String(new char[100]);
	  int i;
	  int k;
	  int ls;
	  int lc;
	  s = new Scanner(System.in).nextLine();
	  c = new Scanner(System.in).nextLine();
	  d = new Scanner(System.in).nextLine();

	  p = tangible.StringFunctions.strStr(s,c);
	  ls = s.length();
	  lc = c.length();
	  int lsc = p - s;
	  if (p != null)
	  {
		  for (i = 0;i < lsc;i++)
		  {
			  c1 = tangible.StringFunctions.changeCharacter(c1, i, s.charAt(i));
		  }
		  c1 = tangible.StringFunctions.changeCharacter(c1, i, '\0');
		  k = 0;
		  for (i = i + lc;i < ls;i++,k++)
		  {
			  c2 = tangible.StringFunctions.changeCharacter(c2, k, s.charAt(i));
		  }
		  c2 = tangible.StringFunctions.changeCharacter(c2, k, '\0');
		  System.out.printf("%s",c1);
		  System.out.printf("%s",d);
		  System.out.printf("%s",c2);
	  }
	  else
	  {
		  System.out.printf("%s",s);
	  }

	  return 0;
	}
}

