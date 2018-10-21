package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String n = new String(new char[1000]);
		int j;
		int i;
		int pos;
		int len1;
		int len2;
		int flag = 0;

		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (!tangible.StringFunctions.strStr(s,a))
		{
			System.out.print(s);
			System.out.print("\n");
			return 0;
		}
		len1 = s.length();
		len2 = a.length();

		for (i = 0,j = 0;s.charAt(i) != '\0';i++)
		{
			if (j >= len2)
			{
				break;
			}
			if (s.charAt(i) == a.charAt(j))
			{
				j++;
				continue;
			}

			if (j != 0)
			{
				i -= j;
				j = 0;

			}

		}

			pos = i;
			j = i - j;
			for (i = 0;i < j;i++)
			{
				n = tangible.StringFunctions.changeCharacter(n, i, s.charAt(i));
			}
			for (j = 0;b.charAt(j) != '\0';j++,i++)
			{
				n = tangible.StringFunctions.changeCharacter(n, i, b.charAt(j));
			}
			j = pos;
			for (;s.charAt(j) != '\0';i++,j++)
			{
				n = tangible.StringFunctions.changeCharacter(n, i, s.charAt(j));
			}
			n = tangible.StringFunctions.changeCharacter(n, i, '\0');
			System.out.print(n);
			System.out.print("\n");

		return 0;
	}
}

