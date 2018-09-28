package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[210]);
		zfc = new Scanner(System.in).nextLine();
		int len = zfc.length();
		for (int k = 0;k < len - 1;k++)
		{
			if ((zfc.charAt(k) != 32) || ((zfc.charAt(k) == 32) && (zfc.charAt(k + 1) != 32)))
			{
				System.out.printf("%c",(zfc.charAt(k)));
			}
			else if ((zfc.charAt(k) == 32) && (zfc.charAt(k + 1) == 32))
			{
				System.out.printf("%c",(zfc.charAt(k)));
				while (zfc.charAt(k) == 32)
				{
					k++;
				}
				k--;
			}
		}
		System.out.printf("%c",(zfc.charAt(len - 1)));
		return 0;
	}
}
