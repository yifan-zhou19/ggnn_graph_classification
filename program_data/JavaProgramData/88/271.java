package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int k;
		String zfc = new String(new char[31]);
		zfc = new Scanner(System.in).nextLine();
		l = zfc.length();
		for (i = 0;i < l;i++)
		{

			if ((zfc.charAt(i) == '1') || (zfc.charAt(i) == '2') || (zfc.charAt(i) == '3') || (zfc.charAt(i) == '4') || (zfc.charAt(i) == '5') || (zfc.charAt(i) == '6') || (zfc.charAt(i) == '7') || (zfc.charAt(i) == '8') || (zfc.charAt(i) == '9') || (zfc.charAt(i) == '0'))
			{
			System.out.printf("%c",zfc.charAt(i));
			}
			else
			{
				System.out.print("\n");
				for (k = i + 1;k < l;k++)
				{
					if (zfc.charAt(k) != '0' && zfc.charAt(k) != '1' && zfc.charAt(k) != '2' && zfc.charAt(k) != '3' && zfc.charAt(k) != '4' && zfc.charAt(k) != '5' && zfc.charAt(k) != '6' && zfc.charAt(k) != '7' && zfc.charAt(k) != '8' && zfc.charAt(k) != '9')
					{
					i++;
					}
					else
					{
						break;
					}
				}
			}
		}
		return 0;
	}
}
