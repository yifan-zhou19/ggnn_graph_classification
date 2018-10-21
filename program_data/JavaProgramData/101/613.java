package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[5]);
		int i;
		int j;
		int k;
		for (i = 1; i <= 3; i++)
		{
			for (j = 1; j <= 3; j++)
			{

				if (i != j)
				{
					k = 6 - i - j;

					if (3 - i == (j > i) + (k == i) && 3 - j == (i > j) + (i > k) && 3 - k == (k > j) + (j > i))
					{

						a = tangible.StringFunctions.changeCharacter(a, i, 'A');
						a = tangible.StringFunctions.changeCharacter(a, j, 'B');
						a = tangible.StringFunctions.changeCharacter(a, k, 'C');
						for (i = 1; i <= 3; i++)
						{
							System.out.printf("%c",a.charAt(i));
						}
						break;
					}
				}
			}
		}
		return 0;
	}

}

