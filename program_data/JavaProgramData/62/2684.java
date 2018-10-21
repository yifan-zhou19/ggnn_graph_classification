package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[10005]);
		zfc = new Scanner(System.in).nextLine();
		int i;
		int l;
		l = zfc.length();
		for (i = 0;i < l;i++)
		{
			if (zfc.charAt(i) != ' ' || (zfc.charAt(i) == ' ' && zfc.charAt(i - 1) != ' '))
			{
				System.out.printf("%c",zfc.charAt(i));
			}
		}
		return 0;
	}
}
