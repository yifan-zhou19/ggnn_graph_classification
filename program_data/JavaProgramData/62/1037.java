package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String zfc = new String(new char[MAX]);

		zfc = new Scanner(System.in).nextLine();

		for (i = 0;zfc.charAt(i);i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				System.out.printf("%c",zfc.charAt(i));
			}

			if (zfc.charAt(i) == ' ' && zfc.charAt(i + 1) != ' ')
			{
				System.out.printf("%c",zfc.charAt(i));
			}
		}
	   return 0;
	}


}
