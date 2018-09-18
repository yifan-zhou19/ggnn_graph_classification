package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[12]);
		String substr = new String(new char[5]);
		int i;
		int j;
		char X;
		while (scanf("%s %s",str,substr) != EOF)
		{
			X = str.charAt(0);
			for (i = 1;i < str.length();i++)
			{
				if (X < str.charAt(i))
				{
					X = str.charAt(i);
				}
			}
			for (i = 1;i < str.length();i++)
			{
				if (str.charAt(i) == X)
				{
					break;
				}
			}
			for (j = 0;j <= i;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.printf("%s",substr);
			for (j = i + 1;j < str.length();j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}

}
