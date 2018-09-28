package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String zfc = new String(new char[1000]);
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				System.out.printf("%c",zfc.charAt(i));
			}
			else if (zfc.charAt(i) == ' ')
			{
				if (zfc.charAt(i + 1) != ' ')
				{
					System.out.print(" ");
				}
				else
				{
					continue;
				}
			}
		}
		return 0;
	}
}
