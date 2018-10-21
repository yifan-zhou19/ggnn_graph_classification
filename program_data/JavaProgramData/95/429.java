package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String strf = new String(new char[80]);
		String strs = new String(new char[80]);
		int lf;
		int ls;
		int i;
		strf = new Scanner(System.in).nextLine();
		strs = new Scanner(System.in).nextLine();
		lf = (int)(strlen)(strf);
		ls = (int)(strlen)(strs);
		for (i = 0;i < lf;i++)
		{
			if ((strf.charAt(i) >= 'A') && (strf.charAt(i) <= 'Z'))
			{
				strf = tangible.StringFunctions.changeCharacter(strf, i, strf.charAt(i) - 'A'+'a');
			}
		}
		for (i = 0;i < ls;i++)
		{
			if ((strs.charAt(i) >= 'A') && (strs.charAt(i) <= 'Z'))
			{
				strs = tangible.StringFunctions.changeCharacter(strs, i, strs.charAt(i) - 'A'+'a');
			}
		}


		if (strcmp(strf,strs) < 0)
		{
			System.out.print("<");
		}
		else if (strcmp(strf,strs) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(strf,strs) == 0)
		{
			System.out.print("=");
		}
	}


}

