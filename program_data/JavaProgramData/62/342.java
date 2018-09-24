package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int k;
		String kg = new String(new char[200]);
		kg = new Scanner(System.in).nextLine();
		m = kg.length();
		for (i = 0;i < m - 1;i++)
		{
			if (kg.charAt(i) == ' ')
			{
				if (kg.charAt(i + 1) != ' ')
				{
					continue;
				}
				else
				{
					k = i;
					while (i < m - 1)
					{
						kg = tangible.StringFunctions.changeCharacter(kg, i, kg.charAt(i + 1));
								 i++;
					}
					i = k - 2;
					m--;
				}
			}
		}
		kg = tangible.StringFunctions.changeCharacter(kg, m, '\0');
		System.out.printf("%s",kg);
		return 0;
	}
}

