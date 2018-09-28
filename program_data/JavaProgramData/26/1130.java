package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m = 0;
		String p = new String(new char[1000]);
		String q = new String(new char[1000]);
		p = new Scanner(System.in).nextLine();
		for (i = 0;p.charAt(i) != '\0';i++)
		{
			if (p.charAt(i) != ' ')
			{
				q = tangible.StringFunctions.changeCharacter(q, m, p.charAt(i));
				m++;
			}
			else if (p.charAt(i) == ' ' && p.charAt(i + 1) != ' ')
			{
				 q = tangible.StringFunctions.changeCharacter(q, m, p.charAt(i));
				 m++;
			}
			else
			{
				continue;
			}
		}
		for (int j = 0;j < m;j++)
		{
			System.out.print(q.charAt(j));
		}
		return 0;
	}
}

