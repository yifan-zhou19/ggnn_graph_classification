package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[10000]);
		zfc = new Scanner(System.in).nextLine();
		int count = 0;
		int len;
		len = zfc.length();
		for (int i = 0;i <= len;i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				count++;
			}
			if (zfc.charAt(i) == ' ' && zfc.charAt(i - 1) != ' ')
			{
				System.out.printf("%d,",count);
				count = 0;
			}
			if (zfc.charAt(i) == '\0' && zfc.charAt(i - 1) != ' ')
			{
				System.out.printf("%d",count - 1);
			}
		}
		return 0;
	}

}
