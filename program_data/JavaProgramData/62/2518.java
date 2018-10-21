package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[5000]);
		String jz = new String(new char[5000]);
		int i;
		int k = 1;
		int n;
		zfc = new Scanner(System.in).nextLine();
		n = zfc.length();
		jz = tangible.StringFunctions.changeCharacter(jz, 0, zfc.charAt(0));
		for (i = 1;i < n;i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				jz = tangible.StringFunctions.changeCharacter(jz, k, zfc.charAt(i));
				k++;
			}
			if (zfc.charAt(i - 1) != ' ' && zfc.charAt(i) == ' ')
			{
				jz = tangible.StringFunctions.changeCharacter(jz, k, zfc.charAt(i));
				k++;
			}
			if (zfc.charAt(i - 1) == ' ' && zfc.charAt(i) == ' ')
			{
			}
			if (zfc.charAt(i - 1) == '.' && zfc.charAt(i) == ' ')
			{
			}
		}
		System.out.println(jz);
	 return 0;

	}
}

