package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[101]);
		z = new Scanner(System.in).nextLine();
		int len;
		int a;
		a = len = z.length();
		for (int i = 1;i < a;)
		{
			if (z.charAt(i) == ' ' && z.charAt(i - 1) == ' ')
			{
				for (int y = i;y < len - 1;y++)
				{
				  z = tangible.StringFunctions.changeCharacter(z, y, z.charAt(y + 1));
				}
				len--;
			}
			else
			{
				i++;
			}
		}
		z = tangible.StringFunctions.changeCharacter(z, len, '\0');
		System.out.printf("%s",z);
		return 0;
	}
}

