package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String k = new String(new char[1000]);
		int i;
		k = new Scanner(System.in).nextLine();

		for (i = 0;k.charAt(i) != '\0';i++)
		{

			if (k.charAt(i) != ' ')
			{
				System.out.printf("%c",k.charAt(i));
			}
			else
			{
				if (k.charAt(i + 1) != ' ')
				{
					System.out.printf("%c",k.charAt(i));
				}
			}
		}

		return 0;

	}

}
