package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String s = new String(new char[30]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				if (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9')
				{
					System.out.printf("%c",s.charAt(i));
				}
				else
				{
					System.out.printf("%c\n",s.charAt(i));
				}
			}
		}
		return 0;
	}
}
