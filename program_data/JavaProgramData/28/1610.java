package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[3000]);
		s = new Scanner(System.in).nextLine();
		int sum = 1;
		int i;
		for (i = 1;i <= s.length();i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				sum = sum + 1;
			}
			if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ')
			{
				System.out.printf("%d,",sum);
				sum = 0;
			}
			if (s.charAt(i) == '\0' && s.charAt(i - 1) != ' ')
			{
				System.out.printf("%d",sum);
			}
		}
		return 0;

	}
}
