package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[250]);
		String t = new String(new char[250]);
		int i;
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) >= 65 && s.charAt(i) <= 92)
			{
				s.charAt(i) += 32;
			}
		}
		for (i = 0;i < t.length();i++)
		{
			if (t.charAt(i) >= 65 && t.charAt(i) <= 92)
			{
				t.charAt(i) += 32;
			}
		}
		if (strcmp(s,t) > 0)
		{
			System.out.print(">\n");
		}
		else if (strcmp(s,t) < 0)
		{
			System.out.print("<\n");
		}
		else
		{
			System.out.print("=\n");
		}
		return 0;
	}


}
