package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int i;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
		if (((a.charAt(1) == '\0') || (b < 13)) && (a.charAt(2) == '\0'))
		{
			System.out.print("0\n");
			System.out.printf("%s",a);
			return 0;
		}
		b = a.charAt(0) - '0';
		for (i = 0;a.charAt(i + 1) != '\0';i++)
		{
		b = b * 10 + a.charAt(i + 1) - '0';
		if (b >= 13)
		{
				a = tangible.StringFunctions.changeCharacter(a, i, b / 13 + '0');
				b = b % 13;
		}
		else
		{
		a = tangible.StringFunctions.changeCharacter(a, i, 0 + '0');
		}
		}
		a = a.substring(0, i);
		if (a.charAt(0) - '0' != 0)
		{
		System.out.printf("%s\n",a);
		System.out.printf("%d",b);
		}
		else
		{
		System.out.printf("%s\n", a.charAt(1));
		System.out.printf("%d",b);
		}

	return 0;
	}

}

