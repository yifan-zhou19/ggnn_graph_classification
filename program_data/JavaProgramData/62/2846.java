package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		char c1;
		char c2;
		int i;
		int j;
		int num = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;(str.charAt(i)) != '\0';i++)
		{
			c1 = str.charAt(i);
			if (c1 == ' ')
			{
				for (j = i + 1;(c2 = str.charAt(j)) == ' ';j++)
				{
					num += 1;
				}
				for (j = i + 1;str.charAt(j) != '\0';j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + num));
				}
				num = 0;
			}
		}
		System.out.printf("%s",str);
	}
}

