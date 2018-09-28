package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int i;
		int j;
		 String a = new String(new char[1001]);
		 a = new Scanner(System.in).nextLine();
		 l = a.length();
		 for (i = l - 1; i > 0; i--)
		 {
			 if (a.charAt(i) == ' ' && a.charAt(i - 1) == ' ')
			 {
				 l--;
				 for (j = i; j < l ; j++)
				 {
					 a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				 }
			 }
		 }
		for (i = 0; i < l; i++)
		{
			System.out.print(a.charAt(i));
		}
		return 0;
	}
}

