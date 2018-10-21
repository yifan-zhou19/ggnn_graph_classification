package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int c;
		String w = new String(new char[100]);
		w = new Scanner(System.in).nextLine();
		c = w.length();
		k = 0;
		for (i = 0;i < c;i++)
		{
			if (w.charAt(i) == ' ')
			{
				for (j = i + 1;w.charAt(j) == ' ';j++)
				{
					for (k = j;k < c;k++)
					{
					  w = tangible.StringFunctions.changeCharacter(w, k, w.charAt(k + 1));
					}
					j--;

				}
			j = 0;
			}

		}

	System.out.printf("%s",w);
		return 0;
	}
}

