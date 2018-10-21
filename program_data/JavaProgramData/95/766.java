package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[10000]);
		String s2 = new String(new char[10000]);
		int i;
		int n;
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		n = s1.length();
		for (i = 0;i < n;i++)
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, i, (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')?(s1.charAt(i) + 32):s1.charAt(i));
		}
		n = s2.length();
			for (i = 0;i < n;i++)
			{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, (s2.charAt(i) >= 'A' && s2.charAt(i) <= 'Z')?(s2.charAt(i) + 32):s2.charAt(i));
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

