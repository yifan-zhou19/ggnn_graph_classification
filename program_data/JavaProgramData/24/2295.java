package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		String str = new String(new char[50]);
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		int max = 0;
		int min = 50;
		int i = 0;
		int j;
		do
		{
			c = System.in.read();
			if (c != ',' && c != ' ' && c != '\n')
			{
				str = tangible.StringFunctions.changeCharacter(str, i++, c);
			}
			else
			{
				if (i > max)
				{
					j = i;
					max = i;
					while (i > 0)
					{
						i--;
						str1 = tangible.StringFunctions.changeCharacter(str1, i, str.charAt(i));
					}
					i = j;
				}
				if (i < min && i != 0)
				{
					min = i;
					while (i > 0)
					{
						i--;
						str2 = tangible.StringFunctions.changeCharacter(str2, i, str.charAt(i));
					}
				}
				i = 0;
			}
		}while (c != '\n');
		for (i = 0; i < max; i++)
		{
			System.out.print(str1.charAt(i));
		}
		System.out.print("\n");
		for (i = 0; i < min; i++)
		{
			System.out.print(str2.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

