package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		char i;
		a = new Scanner(System.in).nextLine();
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) != ' ')
			{
				if (a.charAt(i - 1) == ' ')
				{
					System.out.printf(" %c", a.charAt(i));
				}
				else
				{
					System.out.printf("%c", a.charAt(i));
				}
			}
		}
		System.out.print("\n");
	}
}
