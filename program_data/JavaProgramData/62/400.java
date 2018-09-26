package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int len;
		int sum = 0;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
			a = new Scanner(System.in).nextLine();
			len = a.length();
		 for (i = 0;i < len;i++)
		 {
			   if (a.charAt(i) != ' ' || a.charAt(i) == ' ' && a.charAt(i + 1) != ' ')
			   {
				   b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				   j++;
			   }
			   else if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			   {
				continue;
			   }
		 }

			b = tangible.StringFunctions.changeCharacter(b, j, '\0');
				System.out.printf("%s",b);
		return 0;
	}
}

