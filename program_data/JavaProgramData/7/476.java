package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[600]);
		String sub = new String(new char[300]);
		String rep = new String(new char[300]);
		int i;
		int j;
		int k;
		int sun00 = 0;
		int se = 0;

		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();

		for (i = 0; str.charAt(i) != 0; i++)
		{

			if (str.charAt(i) == sub.charAt(0))
			{

				for (k = i + 1, j = 1;str.charAt(k) != 0 && sub.charAt(j) != 0;k++, j++)
				{
					if (str.charAt(k) != sub.charAt(j))
					{
						break;
					}
				}
				if (sub.charAt(j) == 0)
				{

					sun00 = i;
					se = k;
					break;
				}
			}
		}

		if (sun00 < se)
		{
			if (sub.length() <= rep.length())
			{

				for (i = sun00,j = 0; rep.charAt(j) != 0; i++,j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, rep.charAt(j));
				}

				for (k = se; str.charAt(k) != 0; k++,i++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(k));
				}

				str = str.substring(0, i);
			}
			else
			{

				i = str.length() + rep.length() - sub.length();
				for (k = str.length(); k >= se; k--,i--)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(k));
				}

				for (i = sun00,j = 0; rep.charAt(j) != 0; i++,j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, rep.charAt(j));
				}
			}
		}

		System.out.print(str);

	}
}

