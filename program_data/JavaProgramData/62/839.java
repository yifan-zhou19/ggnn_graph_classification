package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[250]);
		zfc = new Scanner(System.in).nextLine();
		int n = zfc.length();
		for (int i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%c",zfc.charAt(0));
			}
			else if (zfc.charAt(i) != ' ')
			{
				System.out.printf("%c",zfc.charAt(i));
			}
			else if (zfc.charAt(i - 1) != ' ')
			{
				System.out.printf("%c",zfc.charAt(i));
			}
		}
		return 0;
	}

}
