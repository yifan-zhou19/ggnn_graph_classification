package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		final String a = "";
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 30;i++)
		{
			if (a.charAt(i) <= 57 && a.charAt(i) >= 48)
			{
				System.out.printf("%c", a.charAt(i));
			}
			else
			{
				if (a.charAt(i - 1) >= 48 && a.charAt(i - 1) <= 57 && a.charAt(i) != '\0')
				{
					System.out.print("\n");
				}
			 else
			 {
					if (a.charAt(i) == '\0')
					{
						break;
					}
				 else
				 {
					 continue;
				 }
			 }
			}
		}
		return 0;
	}
}
