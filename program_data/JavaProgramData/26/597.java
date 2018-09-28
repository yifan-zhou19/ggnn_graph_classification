package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		str = new Scanner(System.in).nextLine();
		int space = 1;
		for (int i = 0; str.charAt(i); i++)
		{
			if (str.charAt(i) == ' ' && space != 0)
			{
					space = 0;
					System.out.print(str.charAt(i));
			}
			if (str.charAt(i) != ' ')
			{
					space = 1;
					System.out.print(str.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}
}
