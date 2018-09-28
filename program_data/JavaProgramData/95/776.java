package <missing>;

public class GlobalMembers
{
	public static void ast(String s)
	{
		int n;
		int i;
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s[i].compareTo('a') >= 0 && s[i].compareTo('z') <= 0)
			{
				s[i] = s[i] - 32;
			}
		}
	}
	public static void Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		ast(s1);
		ast(s2);
		if (strcmp(s1,s2) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(s1,s2) < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
	}
}
