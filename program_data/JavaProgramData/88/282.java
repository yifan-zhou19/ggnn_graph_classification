package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[30]);
		int i;
		int len;
		zfc = new Scanner(System.in).nextLine();
		len = zfc.length();
		for (i = 0;i < len;i++)
		{
			if (zfc.charAt(i) == '0' || zfc.charAt(i) == '1' || zfc.charAt(i) == '2' || zfc.charAt(i) == '3' || zfc.charAt(i) == '4' || zfc.charAt(i) == '5' || zfc.charAt(i) == '6' || zfc.charAt(i) == '7' || zfc.charAt(i) == '8' || zfc.charAt(i) == '9')
			{
				if (zfc.charAt(i + 1) == '0' || zfc.charAt(i + 1) == '1' || zfc.charAt(i + 1) == '2' || zfc.charAt(i + 1) == '3' || zfc.charAt(i + 1) == '4' || zfc.charAt(i + 1) == '5' || zfc.charAt(i + 1) == '6' || zfc.charAt(i + 1) == '7' || zfc.charAt(i + 1) == '8' || zfc.charAt(i + 1) == '9')
				{
					System.out.printf("%c",zfc.charAt(i));
				}
				else
				{
					System.out.printf("%c\n",zfc.charAt(i));
				}
			}
		}
		return 0;
	}
}
