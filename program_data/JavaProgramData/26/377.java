package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String s = new String(new char[100]);
		 s = new Scanner(System.in).nextLine();

		 String ss = new String(new char[100]);
		  ss = tangible.StringFunctions.changeCharacter(ss, 0, s.charAt(0));
		 int i;
		 int k = 1;
		 for (i = 1;s.charAt(i) != '\0';i++)
		 {
				if (s.charAt(i) != ' ' || s.charAt(i) == ' ' && s.charAt(i - 1) != ' ')
				{
					ss = tangible.StringFunctions.changeCharacter(ss, k++, s.charAt(i));
				}
		 }
			  ss = tangible.StringFunctions.changeCharacter(ss, k, '\0');
		 System.out.println(ss);
		 System.in.read();
	}

}

