package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		if (((a.charAt(0) - '0') * 10 + a.charAt(1) - '0') < 13 && a.charAt(2) == '\0')
		{
			System.out.print("0\n");
			System.out.println(a);
		}
		else
		{
		String b = new String(new char[101]);
		int x = a.charAt(0) - '0';
		int i;
		for (i = 0;a.charAt(i + 1) != '\0';i++)
		{
				b = tangible.StringFunctions.changeCharacter(b, i, (x * 10 + a.charAt(i + 1) - '0') / 13 + '0');
				x = (x * 10 + a.charAt(i + 1) - '0') % 13;
		}
		b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		if (b.charAt(0) == '\0')
		{
			System.out.print("0\n");
		}
		else if (b.charAt(0) == '0')
		{
					  for (i = 0;b.charAt(i) != '\0';i++)
					  {
					  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
					  }
					  b = tangible.StringFunctions.changeCharacter(b, i, '\0');
					  System.out.println(b);
		}
		else
		{
		System.out.println(b);
		}
		System.out.printf("%d",x);
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

