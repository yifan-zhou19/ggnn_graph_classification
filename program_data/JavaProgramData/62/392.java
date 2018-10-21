package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int j;
		int m;
		String a = new String(new char[300]);
		char zm;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				m = i;
				for (j = i;a.charAt(j) != '\0';j++)
				{
					if (a.charAt(j) != ' ')
					{
						break;
					}
				}
				for (k = j;a.charAt(k) != '\0';k++)
				{
					zm = a.charAt(k);
					a = tangible.StringFunctions.changeCharacter(a, m + 1, zm);
					m++;
				}
				a = tangible.StringFunctions.changeCharacter(a, m + 1, '\0');
			}
		}
		System.out.printf("%s", a);

		return 0;
	}




}

