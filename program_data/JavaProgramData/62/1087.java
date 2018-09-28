package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[1000]);
		int i;
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				System.out.printf("%c",zfc.charAt(i));
			}
			else
			{
				if (zfc.charAt(i + 1) == ' ')
				{
					continue;
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		return 0;
	}

}
