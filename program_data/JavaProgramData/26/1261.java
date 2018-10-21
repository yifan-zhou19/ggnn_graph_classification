package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String jz = new String(new char[101]);
		String xg = new String(new char[101]);
		jz = new Scanner(System.in).nextLine();
		int i;
		int j;
		int len;
		len = jz.length();
		for (i = 0,j = 0;i < len - 1;i++)
		{
			if (jz.charAt(i) != ' ')
			{
				xg = tangible.StringFunctions.changeCharacter(xg, j, jz.charAt(i));
				j++;
			}
			else if (jz.charAt(i + 1) != ' ')
			{
				xg = tangible.StringFunctions.changeCharacter(xg, j, jz.charAt(i));
				j++;
			}
		}
		xg = tangible.StringFunctions.changeCharacter(xg, j, jz.charAt(len - 1));
		for (int k = j + 1;k < 101;k++)
		{
			xg = tangible.StringFunctions.changeCharacter(xg, k, '\0');
		}
		System.out.println(xg);
		return 0;
	}
}

