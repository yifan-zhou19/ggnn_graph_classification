package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1001]);
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) > 90)
			{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;a.charAt(i) != '\0';)
		{
			for (j = 0;;j++)
			{
				if (a.charAt(i + j) != a.charAt(i))
				{
					break;
				}
			}
			System.out.printf("(%c,%d)",a.charAt(i),j);
			i = i + j;
		}
	}

}

