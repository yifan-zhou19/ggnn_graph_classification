package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String str = "";
		final String substr = "";
		final String temp = "";
		int n;
		int i;
		int j;
		int t;
		int k;
		while (scanf("%s",str) != EOF)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				substr = tempVar.charAt(0);
			}
		n = str.length();
		temp = str;
		for (j = 1;j <= n - 1;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (temp.charAt(i) > temp.charAt(i + 1))
				{
					t = temp.charAt(i);
					temp = tangible.StringFunctions.changeCharacter(temp, i, temp.charAt(i + 1));
					temp = tangible.StringFunctions.changeCharacter(temp, i + 1, t);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) == temp.charAt(n - 1))
			{
				k = i;
				break;
			}
		}
		for (i = 0;i <= k;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.printf("%s",substr);
		for (i = k + 1;i < n;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
	System.out.print("\n");
		}
	}


}

