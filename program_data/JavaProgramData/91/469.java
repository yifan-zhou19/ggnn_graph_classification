package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);

		int i;
		int j;
		int k;
		int l1;
		int m;
		int n;
		int l2;
		s1 = new Scanner(System.in).nextLine();

		l1 = s1.length();


			for (i = 0;i < l1 - 1;i++)
			{
			  s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i) + s1.charAt(i + 1));
			}
			  s2 = tangible.StringFunctions.changeCharacter(s2, l1 - 1, s1.charAt(l1 - 1) + s1.charAt(0));
			for (i = 0;i < l1;i++)
			{
		   System.out.printf("%c",s2.charAt(i));
			}

			 return 0;
	}

}

