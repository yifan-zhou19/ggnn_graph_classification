package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a.charAt(i) += 'A'-'a';
			}
			i++;
		}
		i = 0;
		char letter = a.charAt(0);
		int again = 0;
		while (true)
		{
			if (a.charAt(i) == letter)
			{
				again++;
			}
			if (a.charAt(i) != letter)
			{
					System.out.printf("(%c,%d)",letter,again);
					again = 1;
					letter = a.charAt(i);
			}
			if (a.charAt(i) == '\0')
			{
				break;
			}
			i++;
		}
		return 0;
	}

}
