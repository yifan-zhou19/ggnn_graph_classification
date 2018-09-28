package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		String zfc = new String(new char[100]);
		String guolv = new String(new char[100]);
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (zfc.charAt(i) == 0)
			{
				guolv = guolv.substring(0, j);
				System.out.println(guolv);
				break;
			}
			else if (zfc.charAt(i) == ' ' && zfc.charAt(i + 1) == ' ')
			{
			   continue;
			}
			else
			{
			   guolv = tangible.StringFunctions.changeCharacter(guolv, j, zfc.charAt(i));
			   j++;
			}
		}
		return 0;
	}
}

