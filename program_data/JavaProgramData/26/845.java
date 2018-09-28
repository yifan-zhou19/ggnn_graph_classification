package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int a;
	  int b;
	  int c;
	  int n;
	  a = 0;
	  String u = new String(new char[101]);
	  String w = new String(new char[101]);
	  u = new Scanner(System.in).nextLine();
	  n = u.length();
	  w = tangible.StringFunctions.changeCharacter(w, 0, u.charAt(0));
	  for (i = 1;i <= n;i++)
	  {
		  if ((u.charAt(i) != ' ' || u.charAt(i - 1) != ' ') && (i < n))
		  {
		  a = a + 1;
		w = tangible.StringFunctions.changeCharacter(w, a, u.charAt(i));
		  }
	   else if (i == n)
	   {
		   a = a + 1;
		   w = tangible.StringFunctions.changeCharacter(w, a, '\0');
	   }
	  }

	  System.out.println(w);
	  return 0;
	}
}

