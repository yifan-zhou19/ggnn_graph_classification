package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a = 0;
		  int b = 0;
		  int c;
		  int i;
		  int j;
		  int n;
		  int s = 0;
		  String p = new String(new char[100000]);
		  String q = new String(new char[100000]);
		  p = new Scanner(System.in).nextLine();
		  for (i = 0;i < p.length();i++)
		  {
		  if (!(p.charAt(i) == ' ' && p.charAt(i + 1) == ' '))
		  {
		  q = tangible.StringFunctions.changeCharacter(q, a, p.charAt(i));
		  a++;
		  }
		  }
		  for (i = 0;i < a;i++)
		  {
		  System.out.printf("%c",q.charAt(i));
		  }
	}

}

