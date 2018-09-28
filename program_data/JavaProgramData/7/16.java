package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		for (i = 1;a.charAt(i - 1) != '\0';i++)
		{
			if (a.charAt(i - 1) == b.charAt(0))
			{
				for (j = 1;b.charAt(j - 1) != '\0';j++)
				{
					if (a.charAt(i - 1 + j - 1) != b.charAt(j - 1))
					{
						break;
					}
				}
				if (b.charAt(j - 1) != '\0')
				{
					continue;
				}
				else
				{
					for (j = i;b.charAt(j - i) != '\0';j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, j - 1, c.charAt(j - i));
					}
				}
				break;
			}
			else
			{
				continue;
			}
		}
		System.out.println(a);
		return 0;
	}


}

