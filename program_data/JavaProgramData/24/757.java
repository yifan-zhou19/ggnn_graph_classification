package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int max;
		int min;
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String t = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		s = tangible.StringFunctions.changeCharacter(s, s.length(), ' ');
		j = 0;
		max = 0;
		min = 100;
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != ' ')
			{
				t = tangible.StringFunctions.changeCharacter(t, j, s.charAt(i));
				j++;
			}
			else
			{
				if (j > max)
				{
					max = j;
					a = t.substring(0, j);
				}
				if (j < min)
				{
					min = j;
					b = t.substring(0, j);
				}
				j = 0;
			}
		}
		for (i = 0;i < max;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n");
		for (i = 0;i < min;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		return 0;
	}
}

