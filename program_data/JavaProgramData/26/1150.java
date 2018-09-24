package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String blabla = new String(new char[5000]);
		int len;
		int i;
		blabla = new Scanner(System.in).nextLine();
		len = blabla.length();
		for (i = 0;i < len;i++)
		{
			switch (blabla.charAt(i))
			{
			case ' ':
				if (i != 0 && blabla.charAt(i - 1) != ' ')
				{
					System.out.printf("%c",blabla.charAt(i));
				}
				break;
			default:
				System.out.printf("%c",blabla.charAt(i));
				break;
			}
		}
		System.out.print("\n");
		return 0;
	}

}
