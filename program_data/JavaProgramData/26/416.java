package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[102]);
		char t;
		s = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int a;
		int b;
		int c;
		b = s.length();
		int n = 0;
		for (k = 0;k < b;k++)
		{
		for (i = 2;i < b;i++)
		{
						 if (s.charAt(i - 1) == ' ')
						 {
								 if (s.charAt(i) == ' ')
								 {
											for (j = i;j < b - 1;j++)
											{
															  s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
											}
															   n++;
															  s = tangible.StringFunctions.changeCharacter(s, b - n, '\0');

								 }
						 }
		}
		}
		System.out.printf("%s",s);
		System.in.read();
	}

}

