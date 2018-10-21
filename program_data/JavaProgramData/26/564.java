package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String s = new String(new char[1001]);
		s = new Scanner(System.in).nextLine();
		i = 0;
		while (s.charAt(i) != '\0')
		{
			while (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				System.out.printf("%c",s.charAt(i));
				i++;
			}
			if (s.charAt(i) != '\0')
			{
				System.out.print(" ");
			}
			while (s.charAt(i) == ' ')
			{
				i++;
			}
		}
		return 0;
	}
}
