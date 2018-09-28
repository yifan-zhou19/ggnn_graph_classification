package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			String a = new String(new char[3000]);
			String b = new String(new char[30000]);
			int i;
			int k = 0;
			int q = 0;
			int t = 0;
			int w = 0;
			a = new Scanner(System.in).nextLine();
			w = a.length();
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			}
			b = tangible.StringFunctions.changeCharacter(b, w - 1, a.charAt(0) + a.charAt(w - 1));
			b = tangible.StringFunctions.changeCharacter(b, w, '\0');
			System.out.println(b);
			return 0;
		}

}

