package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		String zfc = new String(new char[201]);
		zfc = new Scanner(System.in).nextLine();
		n = zfc.length();
		for (int i = 0;i < n;i++)
		{
			if (zfc.charAt(i) == ' ')
			{
				a = 0;
				for (int k = i + 1;k < n;k++)
				{
					if (zfc.charAt(k) == ' ')
					{
						a++;
					}
					else
					{
						break;
					}
				}
				for (int k = i + a + 1;k < n;k++)
				{
					zfc = tangible.StringFunctions.changeCharacter(zfc, k - a, zfc.charAt(k));
				}
				n -= a;
			}
		}
		for (int i = 0;i < n;i++)
		{
			System.out.printf("%c",zfc.charAt(i));
		}
		return 0;
	}

}

