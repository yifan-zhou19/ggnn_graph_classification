package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String sold = new String(new char[1000]);
		String snew = new String(new char[1000]);
		int i;
		int j;
		int k;
		int l;
		a = new Scanner(System.in).nextLine();
		sold = new Scanner(System.in).nextLine();
		snew = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			k = 0;
			for (j = i;j < i + sold.length();j++)
			{
				if (i == a.length() - sold.length())
				{
					if (a.charAt(i - 1) != ' ')
					{
						break;
					}
				}
				if (i != 0 && i != a.length() - sold.length())
				{
					if (a.charAt(i + sold.length()) != ' ' || a.charAt(i - 1) != ' ')
					{
						break;
					}
				}
				if (a.charAt(j) != sold.charAt(k++))
				{
					break;
				}
			}
			if (j == i + sold.length())
			{
				for (k = 0;k < 500;k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, k + i + snew.length(), a.charAt(k + i + sold.length()));
				}
				for (k = 0;k < i;k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(k));
				}
				l = 0;
				for (k = 0;k < snew.length();k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, i + k, snew.charAt(l++));
				}
				for (k = 0;k < 1000;k++)
				{
					a = tangible.StringFunctions.changeCharacter(a, k, b.charAt(k));
				}
				i = i + snew.length() - 1;
			}
		}
		System.out.println(a);
		return 0;
	}
}

