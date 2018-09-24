package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w = new String(new char[100]);
		int sentencelength;
		int i;
		int c = 0;
		w = new Scanner(System.in).nextLine();
		sentencelength = w.length();

		for (i = 1;i < sentencelength;i++)
		{
			if (w.charAt(c) == ' ' && w.charAt(i) == ' ')
			{
				continue;
			}
			else
			{
				c++;
				w = tangible.StringFunctions.changeCharacter(w, c, w.charAt(i));
			}
		}
		w = tangible.StringFunctions.changeCharacter(w, ++c, '\0');
		System.out.println(w);
		return 0;
	}

}

