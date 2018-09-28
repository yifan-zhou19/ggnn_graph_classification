package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[1000]);
		int i;
		int j;
		z = new Scanner(System.in).nextLine();
		for (i = 0;z.charAt(i);i++)
		{
			if (z.charAt(i) == ' ' && z.charAt(i + 1) == ' ')
			{
				for (j = i;z.charAt(j);j++)
				{
					z = tangible.StringFunctions.changeCharacter(z, j, z.charAt(j + 1));
				}
				i--;
			}
		}
		System.out.println(z);
		return 0;
	}


}

