package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s0 = new String(new char[200]);
		String s = new String(new char[200]);
		String kg = new String(new char[200]);
		int i;
		int i1;
		int k = 0;
		int n;
		s0 = new Scanner(System.in).nextLine();
		n = s0.length();
		for (i = 0;i < n;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i + 1, s0.charAt(i));
		}
		s = tangible.StringFunctions.changeCharacter(s, 0, s[n + 1] = ' ');
		for (i = n + 1;i >= 0;i--)
		{
			if (s.charAt(i) == ' ')
			{
				k = k + 1;
				kg = tangible.StringFunctions.changeCharacter(kg, k, i);
			}
		}
		if (k == 2)
		{
			System.out.println(s0);
		}
		else
		{
			for (i = kg.charAt(2) + 1;i < kg.charAt(1);i++)
			{
			System.out.printf("%c",s.charAt(i));
			}
			for (i = 2;i <= k - 1;i++)
			{
				for (i1 = kg.charAt(i + 1);i1 < kg.charAt(i);i1++)
				{
					System.out.printf("%c",s.charAt(i1));
				}
			}
		}
	}


}

