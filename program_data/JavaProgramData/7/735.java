package <missing>;

public class GlobalMembers
{
	public static String zfc1 = new String(new char[100]);
	public static String zfc2 = new String(new char[100]);
	public static String zfc3 = new String(new char[100]);
	public static int Main()
	{
		int len1;
		int len2;
		int i;
		int j;
		int k = 1;
		int g = 0;
		zfc1 = new Scanner(System.in).nextLine();
		zfc2 = new Scanner(System.in).nextLine();
		zfc3 = new Scanner(System.in).nextLine();
		len1 = zfc1.length();
		len2 = zfc2.length();
		for (i = 0;i < len1;i++)
		{
			if (zfc2.charAt(0) == zfc1.charAt(i))
			{
				for (j = 1;j < len2;j++)
				{
					if (zfc2.charAt(j) == zfc1.charAt(i + j))
					{
						k++;
					}
				}
			}
			if (k == len2)
			{
				g++;
				break;
			}
			else
			{
				k = 1;
			}
		}
		if (g == 0)
		{
			System.out.println(zfc1);
		}
		else
		{
			zfc1 = zfc1.substring(0, i);
			System.out.printf("%s%s%s",zfc1,zfc3,zfc1.charAt(i + len2));
		}
		return 0;
	}
}
