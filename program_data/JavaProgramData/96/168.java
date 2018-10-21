package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int i;
		int l;
		String N = new String(new char[100]);
		String S = new String(new char[99]);
		N = new Scanner(System.in).nextLine();
		l = N.length();
		if (l == 1)
		{
				System.out.print("0\n");
				System.out.printf("%s\n",N);
		}
		else if (l == 2)
		{
				int q = (10 * (N.charAt(0) - '0') + (N.charAt(1) - '0')) / 13;
				s = (10 * (N.charAt(0) - '0') + (N.charAt(1) - '0')) % 13;
				System.out.printf("%d\n",q);
				System.out.printf("%d\n",s);
		}
		else
		{
		if (10 * (N.charAt(0) - '0') + (N.charAt(1) - '0') >= 13)
		{
			s = (N.charAt(0) - '0') * 10 + N.charAt(1) - '0';
			  for (i = 0;i < (l - 2);i++)
			  {
				S = tangible.StringFunctions.changeCharacter(S, i, s / 13 + '0');
				s = (s % 13) * 10 + N.charAt(i + 2) - '0';
			  }
			  S = tangible.StringFunctions.changeCharacter(S, i, s / 13 + '0');
			  s = s % 13;
			  S = tangible.StringFunctions.changeCharacter(S, i + 1, '\0');
			  System.out.printf("%s\n",S);
			  System.out.printf("%d\n",s);
		}
		else
		{
			  s = (N.charAt(0) - '0') * 100 + (N.charAt(1) - '0') * 10 + N.charAt(2) - '0';
			  for (i = 0;i < (l - 3);i++)
			  {
				S = tangible.StringFunctions.changeCharacter(S, i, s / 13 + '0');
				s = (s % 13) * 10 + N.charAt(i + 3) - '0';
			  }
			  S = tangible.StringFunctions.changeCharacter(S, i, s / 13 + '0');
			  s = s % 13;
			  S = tangible.StringFunctions.changeCharacter(S, i + 1, '\0');
			  System.out.printf("%s\n",S);
			  System.out.printf("%d\n",s);
		}
		}
		System.in.read();
		System.in.read();
	}
}

