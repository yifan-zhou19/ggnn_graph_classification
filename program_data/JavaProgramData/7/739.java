package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String sub = new String(new char[257]);
		String rep = new String(new char[257]);
		int i;
		int j;
		int k;
		int ss = 0;
		int se = 0;
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != 0;i++)
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
					ss = i;
					se = k;
					break;
				}

			}
		}
		if (ss < se)
		{
			if (sub.length() <= rep.length())
			{
				for (i = ss,j = 0;rep.charAt(j) != 0;i++,j++)
				{
				str = tangible.StringFunctions.changeCharacter(str, i, rep.charAt(j));
				}
				for (k = se;str.charAt(k) != 0;k++,i++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(k));

				}
				for (i = ss,j = 0;rep.charAt(j) != 0;i++,j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, rep.charAt(j));
				}
			}
		}

		System.out.print(str);
		return 0;
	}
}

