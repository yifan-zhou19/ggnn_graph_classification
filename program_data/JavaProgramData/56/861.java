package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10]);
		int i;
		int j;
		for (i = 0;;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		j = i - 1;
		for (i = j;i >= 0;i--)
		{
			System.out.printf("%c",a.charAt(i));
		}
	}
}

