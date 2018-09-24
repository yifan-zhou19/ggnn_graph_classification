package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  char d;
	  String a = new String(new char[11]);
	  String b = new String(new char[4]);
	  String c = new String(new char[14]);
	  int n;
	  int i;
	  int f;
	  while (scanf("%s %s",a,b) != EOF)
	  {
		 n = a.length();
		 d = a.charAt(0);
		 f = 0;
		 for (i = 0;i < n;i++)
		 {
			 if (a.charAt(i) > d)
			 {
			d = a.charAt(i);
			f = i;
			 }
		 }
		c = tangible.StringFunctions.changeCharacter(c, 0, '\0');
		strncat(c,a,f + 1);
		c += b;
		c += a.Substring(f) + 1;
		System.out.println(c);
	  }
	}
}

