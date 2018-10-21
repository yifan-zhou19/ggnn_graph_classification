package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[20000]);
		String a = new String(new char[100]);
		String maxa = new String(new char[100]);
		String mina = new String(new char[100]);
		int len;
		int min = 1000;
		int max = 0;
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			for (j = 0;s.charAt(i) != ' ' && s.charAt(i) != ',' && s.charAt(i) != '\0';j++, i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i));
			}
			a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			len = a.length();
			if (len == 0)
			{
				continue;
			}
			if (max < len)
			{
				max = len;
				maxa = a;
			}
			if (min > len)
			{
				min = len;
				mina = a;
			}
			if (s.charAt(i) == '\0')
			{
				break;
			}
		}
		System.out.printf("%s\n%s\n",maxa,mina);
	}
}

