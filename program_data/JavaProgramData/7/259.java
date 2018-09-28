package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[100]);
		String zf1 = new String(new char[100]);
		String zf2 = new String(new char[100]);
		int i;
		int j;
		int k;
		zf = new Scanner(System.in).nextLine();
		zf1 = new Scanner(System.in).nextLine();
		zf2 = new Scanner(System.in).nextLine();
		k = zf1.length();
		for (i = 0;zf.charAt(i) != 0;i++)
		{

			for (j = 0;zf1.charAt(j) != 0;j++)
			{
				if (zf1.charAt(j) != zf.charAt(i + j))
				{
					break;
				}
			}
			if (j == (k))
			{
				for (j = 0;zf2.charAt(j) != 0;j++)
				{
					zf = tangible.StringFunctions.changeCharacter(zf, i + j, zf2.charAt(j));
				}
				break;
			}

		}
		System.out.printf("%s",zf);
		return 0;
	}


}

