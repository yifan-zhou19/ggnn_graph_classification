package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String a = new String(new char[200]);
		 a = new Scanner(System.in).nextLine();
		 int i;
		 int j;
		 int len = a.length();
		 String b = new String(new char[200]);
		 j = 0;
		 for (i = 0;i < len;i++)
		 {
			 if ((a.charAt(i) != ' ' && a.charAt(i + 1) != ' '))
			 {
				 b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			  j++;
			 }
			 else if ((a.charAt(i) != ' ') && (a.charAt(i + 1) == ' '))
			 {
				 b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
			  b = tangible.StringFunctions.changeCharacter(b, j + 1, a.charAt(i + 1));
			  j = j + 2;
			  i++;
			 }

		 }
		 for (i = 0;i < j;i++)
		 {
		 System.out.printf("%c",b.charAt(i));
		 }

	}


}

