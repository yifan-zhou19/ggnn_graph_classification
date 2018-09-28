package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[100]);
		zfc = new Scanner(System.in).nextLine();
		int i;
		int k;
		for (i = 0;zfc.charAt(i) != 0;i++)
		{
			if (zfc.charAt(i) >= '0' && zfc.charAt(i) <= '9')
			{
				for (k = i;zfc.charAt(k) != 0;k++)
				{
					if (!(zfc.charAt(k + 1) >= '0' && zfc.charAt(k + 1) <= '9'))
					{
						break;
					}
				}
				for (i = i;i <= k;i++)
				{
					System.out.printf("%c",zfc.charAt(i));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}
