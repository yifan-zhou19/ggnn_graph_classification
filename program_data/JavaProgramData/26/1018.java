package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int j;
		int n;
	String s = new String(new char[101]);
	String a = new String(new char[101]);
	 s = new Scanner(System.in).nextLine();
	 m = s.length();
	 j = 0;
	 for (i = 0;i < m;i++)
	 {
		 if (i == 0)

		 {
		 if (s.charAt(i) != ' ')
		 {
			 a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i));
						j++;
		 }
		 }

		 else
		 {
		 if (s.charAt(i) != ' ' || (s.charAt(i) == ' ' && s.charAt(i - 1) != ' '))
		 {
		 a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i));
	 j++;
		 }
		 }
	 }

	 for (i = 0;i < j;i++)
	 {
		 System.out.printf("%c",a.charAt(i));
	 }
	 return 0;
	}


}

