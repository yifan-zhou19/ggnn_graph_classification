package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		int i;
		int k;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ' ')
			{
				while (true)
				{
					if (a.charAt(i + 1) == ' ')
					{
						for (k = i;a.charAt(k) != '\0';k++)
						{
							a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + 1));
						}
					}
					else
					{
						break;
					}
				}
			}
		}
		System.out.printf("%s",a);
		return 0;
	}
}

