package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[101]);
		int i;
		String = new Scanner(System.in).nextLine();
		System.out.printf("%c",string.charAt(0));
		for (i = 1;(String[i]) != '\0';i++)
		{
			if (String[i] != ' ')
			{
				System.out.printf("%c",string.charAt(i));
			}
			else
			{
				if (String[i - 1] != ' ')
				{
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}
