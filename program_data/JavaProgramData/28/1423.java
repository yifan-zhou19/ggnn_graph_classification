package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		int k = s.length();
		s = tangible.StringFunctions.changeCharacter(s, k, ' ');
		int i;
		int a = 0;
		for (i = 0;i <= k;i++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')
			{
				continue;
			}
			if (s.charAt(i) != ' ')
			{
				a++;
			}
			if (s.charAt(i) == ' ')
			{
				System.out.printf("%d",a);
				if (i < k)
				{
					System.out.print(",");
				}
			}
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
			{
				a = 0;
			}

		}
		return 0;
	}
}

