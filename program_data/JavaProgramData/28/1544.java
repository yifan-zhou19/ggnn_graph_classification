package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[2000]);
		zfc = new Scanner(System.in).nextLine();
		int sl = zfc.length();
		int n = 0;
		for (int i = 0;i <= sl;i++)
		{

			if (i == 0)
			{
				n++;
				continue;
			}
			if (zfc.charAt(i) != ' ' && zfc.charAt(i) != '\0')
			{
				n++;
				continue;
			}
			if (zfc.charAt(i) == ' ' && zfc.charAt(i - 1) != ' ')
			{
				System.out.printf("%d,",n);
				n = 0;
				continue;
			}
			if (zfc.charAt(i) == ' ' && zfc.charAt(i + 1) == ' ')
			{
				continue;
			}
			if (zfc.charAt(i) == '\0')
			{
				System.out.printf("%d",n);
			}
		}
		return 0;
	}

}
