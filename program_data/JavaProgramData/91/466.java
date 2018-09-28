package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String z1 = "";
		final String z2 = "";
		z1 = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		k = z1.length();
		for (i = 0,j = 0;i < k - 1;i++,j++)
		{
			z2 = tangible.StringFunctions.changeCharacter(z2, j, z1.charAt(i) + z1.charAt(i + 1));
		}
		z2 = tangible.StringFunctions.changeCharacter(z2, k - 1, z1.charAt(k - 1) + z1.charAt(0));
		System.out.printf("%s",z2);
		return 0;
	}

}

