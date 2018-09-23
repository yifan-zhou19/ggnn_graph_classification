package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int i = 0;
		String j = new String(new char[5]);
		int[] words = new int[5];
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					words[a] = (a < b) + (c == a);
					words[b] = (a > b) + (a > c);
					words[c] = (c > b) + (b > a);
					j = tangible.StringFunctions.changeCharacter(j, a, 'A');
					j = tangible.StringFunctions.changeCharacter(j, b, 'B');
					j = tangible.StringFunctions.changeCharacter(j, c, 'C');
					if ((words[a] + a) == 3 && (words[b] + b) == 3 && (words[c] + c) == 3)
					{
						for (i = 1;i <= 3;i++)
						{
							System.out.print(j.charAt(i));
						}
					}
				}
				break;
			}
		}
	return 0;
	}
}

