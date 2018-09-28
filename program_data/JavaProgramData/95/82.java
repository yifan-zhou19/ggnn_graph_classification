package <missing>;

public class GlobalMembers
{
	public static void Main(String[] * args)
	{
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
	int i;
		 s1 = new Scanner(System.in).nextLine();
		 s2 = new Scanner(System.in).nextLine();
		 for (i = 0;i < 80;i++)
		 {
			 if (s1.charAt(i) >= 97 && s1.charAt(i) <= 122)
			 {
				 s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 32);
			 }
			  if (s2.charAt(i) >= 97 && s2.charAt(i) <= 122)
			  {
				 s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) - 32);
			  }
		 }


		 if (strcmp(s1,s2) == 0)
		 {
			 System.out.print("=");
		 }
		 if (strcmp(s1,s2) > 0)
		 {
			 System.out.print(">");
		 }
		 if (strcmp(s1,s2) < 0)
		 {
			 System.out.print("<");
		 }
	}


}

