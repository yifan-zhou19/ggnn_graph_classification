package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String quene = "";
		char boy;
		char girl;
		int i;
		int n;
		int g = 0;
		int pair;
		quene = new Scanner(System.in).nextLine();
		n = quene.length();
		pair = n / 2;
		boy = quene.charAt(0);
		for (i = 0;i < n;i++)
		{
			if (quene.charAt(i) != boy)
			{
				girl = quene.charAt(i);
				break;
			}
		}
		while (pair > 0)
		{
			for (i = g;i < n;i++)
			{
				if (quene.charAt(i) == girl)
				{
					g = i;
					break;
				}
			}
			for (i = g;i >= 0;i--)
			{
				if (quene.charAt(i) == boy)
				{
					System.out.printf("%d %d\n",i,g);
					pair--;
					quene = tangible.StringFunctions.changeCharacter(quene, i, 'a');
					quene = tangible.StringFunctions.changeCharacter(quene, g, 'a');
					break;
				}
			}
		}
	}
}

