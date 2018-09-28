package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String temp = new String(new char[100]);
		String maxs = new String(new char[1000]);
		String mins = new String(new char[100]);
		int maxl;
		int minl;
		maxs = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < 100;i++)
		{
			mins = tangible.StringFunctions.changeCharacter(mins, i, maxs.charAt(i));
		}
		maxl = minl = maxs.length();

		for (i = 1;i < n;i++)
		{
			temp = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int t = temp.length();
			if (t > maxl)
			{
				maxl = t;
				for (int j = 0;j <= maxl;j++)
				{
					maxs = tangible.StringFunctions.changeCharacter(maxs, j, temp.charAt(j));
				}
			}

			if (t < minl)
			{
				minl = t;
				for (int j = 0;j <= minl;j++)
				{
					mins = tangible.StringFunctions.changeCharacter(mins, j, temp.charAt(j));
				}

			}
		}

		System.out.print(maxs);
		System.out.print("\n");
		System.out.print(mins);
		System.out.print("\n");

	}

}

