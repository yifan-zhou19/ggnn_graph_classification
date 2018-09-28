package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[100]);
		zfc = new Scanner(System.in).nextLine();
		int n;
		n = zfc.length();
		int i;
		System.out.printf("%c",zfc.charAt(0));
		for (i = 1;i < n;i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				System.out.printf("%c",zfc.charAt(i));
			}
			else if (zfc.charAt(i) == ' ' && zfc.charAt(i - 1) != ' ')
			{
				System.out.printf("%c",zfc.charAt(i));
			}
		}
		return 0;
	}
}
