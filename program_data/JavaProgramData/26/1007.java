package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String cs = new String(new char[300]);
		final String jg = "";
		cs = new Scanner(System.in).nextLine();
		int i;
		int t = 0;
		int m;
		for (i = 0;cs.charAt(i) != '\0';i++)
		{
								 if (cs.charAt(i) != ' ')
								 {
											 jg = tangible.StringFunctions.changeCharacter(jg, t, cs.charAt(i));
											 t++;
								 }
								 else
								 {
									  jg = tangible.StringFunctions.changeCharacter(jg, t, ' ');
									  t++;
									  for (m = 1;cs.charAt(i + m) == ' ';m++)
									  {
										  ;
									  }
									  i += m - 1;
								 }
		}
		System.out.printf("%s",jg);

		return 0;
	}
}

