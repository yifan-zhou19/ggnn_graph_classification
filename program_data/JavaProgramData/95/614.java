package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String s1 = new String(new char[100]);
	  String s2 = new String(new char[100]);
	  int length1;
	  int i;
	  int length2;
	  s1 = new Scanner(System.in).nextLine();
	  s2 = new Scanner(System.in).nextLine();
	  length1 = s1.length();
	  for (i = 0;i < length1;i++)
	  {
		if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
		{
		   s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
		}
	  }
	 length2 = s2.length();
	 for (i = 0;i < length2;i++)
	 {
		if (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z')
		{
		   s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
		}
	 }
	if (strcmp(s1,s2) > 0)
	{
	  System.out.print(">");
	}
	else if (strcmp(s1,s2) < 0)
	{
	  System.out.print("<");
	}
	else
	{
		System.out.print("=");
	}
	}

}

