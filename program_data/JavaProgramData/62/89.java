package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[101]);
		  String b = new String(new char[101]);
		  int n;
		  int i;
		  int j = 0;
			  a = new Scanner(System.in).nextLine();
		  n = a.length();
					  for (i = 0;i < n - 1;i++)
					  {
										  if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
										  {
										continue;
										  }
										else
										{
											  b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
										   j++;
										}
					  }
		  if (a.charAt(n - 1) == ' ')
		  {
		  b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		  }
		  else
		  {
			  b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(n - 1));
		   b = tangible.StringFunctions.changeCharacter(b, j + 1, '\0');
		  }
		  System.out.println(b);
		  System.in.read();
	}
}

