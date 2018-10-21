package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		int n;
		int i;
		int a = 0;
		int b = 100;
		int a1;
		int b1;
		int sum = 0;
		int t;
		s = new Scanner(System.in).nextLine();
		t = s.length();
		for (i = 0; i <= t;i++)
		{

			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				sum = sum + 1;
			}
			else if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
			{
				if (sum > a)
				{
					a = sum;
					a1 = i - sum;
				}
				if (sum < b)
				{
					b = sum;
					b1 = i - sum;

				}
				sum = 0;
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
			}
		}
		System.out.printf("%s\n", s.Substring(a1));
		System.out.printf("%s\n", s.Substring(b1));


		return 0;

	}

}

