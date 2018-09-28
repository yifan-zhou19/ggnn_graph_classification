package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		String s = new String(new char[500]);
		String max = new String(new char[20]);
		String min = new String(new char[20]);
		String x = new String(new char[20]);
		s = new Scanner(System.in).nextLine();
		for (;s.charAt(i) != ' ';i++)
		{
				x = tangible.StringFunctions.changeCharacter(x, i, s.charAt(i));
		}
			x = tangible.StringFunctions.changeCharacter(x, i, '\0');
			min = x;
			max = x;
			i++;
		for (;s.charAt(i);i++)
		{
			for (j = 0;s.charAt(i) != ' ' && s.charAt(i) != '\0';i++, j++)
			{
				x = tangible.StringFunctions.changeCharacter(x, j, s.charAt(i));
			}
			x = tangible.StringFunctions.changeCharacter(x, j, '\0');
			if (x.length() > max.length())
			{
				max = x;
			}
			if (x.length() < min.length())
			{
				min = x;
			}
			if (s.charAt(i) == '\0')
			{
				break;
			}
		}
		System.out.printf("%s\n", max);
		System.out.printf("%s\n", min);
		return 0;
	}
}

