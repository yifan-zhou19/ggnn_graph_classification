package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		int len;
		len = str.length();
		int max = 0;
		int min = 10000;
		int i;
		int lenth = 0;
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) != ' ')
			{
				lenth = lenth + 1;
			}
			if (str.charAt(i) == ' ')
			{
				if (lenth > max)
				{
					max = lenth;
				}
				if (lenth < min)
				{
					min = lenth;
				}
				lenth = 0;
			}

			if (str.charAt(i + 1) == '\0')
			{
				if (lenth > max)
				{
					max = lenth;
				}
				if (lenth < min)
				{
					min = lenth;
				}
			}

		}
		lenth = 0;
		int maxpostail;
		int minpostail;
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) != ' ')
			{
				lenth = lenth + 1;
			}
			if (str.charAt(i) == ' ')
			{
				if (lenth == max)
				{
					maxpostail = i - 1;
					break;
				}
				lenth = 0;
			}

			if (str.charAt(i + 1) == '\0')
			{
				if (lenth == max)
				{
					maxpostail = i;
					break;
				}
			}

		}
		String maxlenword = new String(new char[100]);
		for (i = 0;i <= max - 1;i++)
		{
			maxlenword = tangible.StringFunctions.changeCharacter(maxlenword, i, str.charAt(maxpostail - (max - 1) + i));
		}
		maxlenword = tangible.StringFunctions.changeCharacter(maxlenword, max, '\0');
		System.out.println(maxlenword);
	lenth = 0;

	for (i = 0;i < len;i++)
	{
			if (str.charAt(i) != ' ')
			{
				lenth = lenth + 1;
			}
			if (str.charAt(i) == ' ')
			{
				if (lenth == min)
				{
					minpostail = i - 1;
					break;
				}
				lenth = 0;
			}

			if (str.charAt(i + 1) == '\0')
			{
				if (lenth == min)
				{
					minpostail = i;
					break;
				}
			}

	}
		String minlenword = new String(new char[100]);
		for (i = 0;i <= min - 1;i++)
		{
			minlenword = tangible.StringFunctions.changeCharacter(minlenword, i, str.charAt(minpostail - (min - 1) + i));
		}
		minlenword = tangible.StringFunctions.changeCharacter(minlenword, min, '\0');
		System.out.println(minlenword);
	}

}

