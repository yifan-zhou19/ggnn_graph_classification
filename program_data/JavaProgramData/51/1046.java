package <missing>;

public class GlobalMembers
{
	//??????
	public static int Main()
	{
		int n;
		final String str = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = str.length();
		String p = str;
		final String substr = "";
		substr = tangible.StringFunctions.changeCharacter(substr, n, '\0');
		int[] fre = new int[510];
		int maxfre = 0;
		for (int i = 0;i <= len - n;i++)
		{
			substr = p.substring(i, i + n);
			for (int j = i;j <= len - n;j++)
			{
				if (!strncmp(substr,p.Substring(j),n))
				{
					fre[i]++;
				}
			}
			if (fre[i] > maxfre)
			{
				maxfre = fre[i];
			}
		}
		if (maxfre == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(maxfre);
			System.out.print("\n");
			for (int i = 0;i <= len - n;i++)
			{
				if (fre[i] == maxfre)
				{
					for (int j = i;j < i + n;j++)
					{
						System.out.print(str.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

