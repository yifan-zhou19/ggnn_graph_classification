package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[1000]);
	public static int Main()
	{
		char c;
		int i = 0;
		while ((c = System.in.read()) != '\n')
		{
			str = tangible.StringFunctions.changeCharacter(str, i, c);
			i++;
		}
		str = tangible.StringFunctions.changeCharacter(str, i, '\0');
		int len = i;
		int count = 0;
		int num = 0;
		for (i = 0;i <= len;i++)
		{
			if (str.charAt(i) == ' ' || str.charAt(i) == '\0')
			{
				if (count == 0)
				{
					continue;
				}
				if (num == 0)
				{
				System.out.print(count);
				num++;
				}
				else
				{
					System.out.print(",");
					System.out.print(count);
				}
				count = 0;
				continue;
			}
			count++;
		}
		System.out.print("\n");

		return 0;
	}


}

