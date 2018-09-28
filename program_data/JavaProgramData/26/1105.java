package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int k;
		int a;
		String zf = new String(new char[101]);
		zf = new Scanner(System.in).nextLine();
		len = zf.length();
		for (i = 0,k = 0;i < len;i++)
		{
			if (zf.charAt(i) == ' ' && zf.charAt(i + 1) == ' ')
			{
			   continue;
			}
			zf = tangible.StringFunctions.changeCharacter(zf, k, zf.charAt(i));
			k++;
		}
		zf = tangible.StringFunctions.changeCharacter(zf, k, '\0');
		System.out.println(zf);
		return 0;
	}
}

