package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zxc = new String(new char[230]);
		String cxz = new String(new char[230]);
		int i;
		int j;
		int n;
		int len;
		zxc = new Scanner(System.in).nextLine();
		for (j = 0;zxc.charAt(j) != '\0';j++)
		{
			if (zxc.charAt(j) == ' ')
			{
				if (zxc.charAt(j - 1) == ' ')
				{
					for (i = j;zxc.charAt(i) != '\0';i++)
					{
						zxc = tangible.StringFunctions.changeCharacter(zxc, i, zxc.charAt(i + 1));
					}
					j--;
				}
			}
		}
		System.out.println(zxc);
		return 0;
	}

}

