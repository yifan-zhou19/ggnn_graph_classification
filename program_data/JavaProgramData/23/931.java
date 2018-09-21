package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		char morning;
		int k = str.length();
		int dream = k - 1;
		while (i <= dream)
		{
		 morning = str.charAt(i);
		 str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(dream));
		 str = tangible.StringFunctions.changeCharacter(str, dream, morning);
		 i++;
		 dream--;

		}
		j = 0;
		int m;
		int y;
		while (j <= k - 1)
		{
			m = j;
			while (str.charAt(j) != ' ' && j <= k - 1)
			{
				j++;
			}
			y = j - 1;
			while (m <= y)
			{
				morning = str.charAt(m);
					str = tangible.StringFunctions.changeCharacter(str, m, str.charAt(y));
			str = tangible.StringFunctions.changeCharacter(str, y, morning);
			m++;
			y--;
			}
			j++;
		}
		for (i = 0;i <= k - 1;i++)
		{
			System.out.print(str.charAt(i));
		}
	}




}

