package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int l;
		  int i;
		  int k;
		  String a = new String(new char[10000]);
		  String b = new String(new char[10000]);
		  a = new Scanner(System.in).nextLine();
		  l = a.length();
		  b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		  for (i = 1,k = 1;i < l;i++)
		  {
						  if (a.charAt(i) == ' ' && a.charAt(i - 1) == ' ')
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

