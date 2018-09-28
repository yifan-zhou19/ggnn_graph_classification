package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String sz = "";
		final String result = "";
		int k;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz = tempVar.charAt(0);
		}
		if (sz.length() == 1)
		{
			j = sz.charAt(0) - 48;
			System.out.printf("0\n%d",j);
		}
		else if (sz.length() == 2)
		{
			j = (sz.charAt(0) - 48) * 10 + (sz.charAt(1) - 48);
			System.out.printf("%d\n%d",j / 13,j % 13);
		}
		else
		{
		k = sz.charAt(0) - 48;
		for (j = k,i = 1;i < sz.length();i++)
		{
			k = j * 10 + (sz.charAt(i) - 48);
			for (m = 0;m <= 9;m++)
			{
				if (13 * m <= k != 0 && 13 * (m + 1)> k)
				{
					result = tangible.StringFunctions.changeCharacter(result, i - 1, m + 48);
					j = k - 13 * m;
					break;
				}
			}
		}
			if (result.charAt(0) != '0')
			{
				System.out.printf("%c",result.charAt(0));
			}
			for (i = 1;i < result.length() - 1;i++)
			{
				System.out.printf("%c",result.charAt(i));
			}
			System.out.printf("%c\n",result.charAt(result.length() - 1));
			System.out.printf("%d",j);
		}
			return 0;
	}
}

