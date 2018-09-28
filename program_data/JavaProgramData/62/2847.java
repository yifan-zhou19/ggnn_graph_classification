package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[2000]);
		String a = new String(new char[2000]);
		int i;
		int k;
		int n;
		int b;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		k = 0;
		i = 0;
		while (i < n)
		{
			if (s.charAt(i) != ' ')
			{
				b = 0;
				a = tangible.StringFunctions.changeCharacter(a, k, s.charAt(i));
				k++;
			}
			else if (b < 1)
			{
				a = tangible.StringFunctions.changeCharacter(a, k, s.charAt(i));
				k++;
				b++;
			}
			i++;
		}
		a = tangible.StringFunctions.changeCharacter(a, k, '\0');
		System.out.printf("%s",a);
	}
}

