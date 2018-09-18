package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int l;
		int max;
		String str = new String(new char[15]);
		String substr = new String(new char[3]);
		while (scanf("%s%s",str,substr) != EOF) //scanf???????????????????????
		{
			l = str.length();
			max = 0;
			for (i = 0;i < l;i++)
			{
				if (str.charAt(max) < str.charAt(i))
				{
					max = i;
				}
			}
			for (j = l - 1;j > max;j--)
			{
				str = tangible.StringFunctions.changeCharacter(str, j + 3, str.charAt(j));
			}
			for (j = max + 1;j < max + 4;j++)
			{
				str = tangible.StringFunctions.changeCharacter(str, j, substr.charAt(j - max - 1));
			}
			for (j = 0;j < l + 3;j++)
			{
				System.out.printf("%c",str.charAt(j));
			}
			System.out.print("\n");
		}
	}
}

