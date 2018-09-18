package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char maxs;
		int j;
		int max;
		while (scanf("%s%s",str,substr) != EOF) //???%s?????scanf????????
		{
			max = 0;
			maxs = str.charAt(0); //????strcpy??
			for (j = 1;j < str.length();j++)
			{
				if (str.charAt(j) > maxs)
				{
					max = j;
					maxs = str.charAt(j);
				}
			}
			for (j = 0;j <= max;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.printf("%s",substr);
			for (j = max + 1;j < str.length();j++)
			{
				if (str.charAt(j) == '\0')
				{
					break;
				}
				else
				{
					System.out.printf("%c",str.charAt(j));
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}
