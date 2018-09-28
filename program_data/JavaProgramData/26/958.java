package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String jz = new String(new char[101]);
		String jg = new String(new char[101]);
		jz = new Scanner(System.in).nextLine();
		n = jz.length();
		int s = 0;
		for (i = 0;i < n;i++)
		{
			if (jz.charAt(i) != 32)
			{
				jg = tangible.StringFunctions.changeCharacter(jg, s, jz.charAt(i));
				s++;
			}
			else
			{
				if (jz.charAt(i - 1) != 32)
				{
					jg = tangible.StringFunctions.changeCharacter(jg, s, jz.charAt(i));
					s++;
				}
			}
		}
		for (i = 0;i < s;i++)
		{
			System.out.printf("%c",jg.charAt(i));
		}
		return 0;
	}
}

