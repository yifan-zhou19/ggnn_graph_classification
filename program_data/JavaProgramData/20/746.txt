package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[20]);
		String substr = new String(new char[4]);
		int max;
		int i;
		int j;
		int k;
		int p;
		int length;
		while (scanf("%s %s",str,substr) != EOF)
		{
			length = str.length();
			max = str.charAt(0);
			for (i = 1;i < length;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					k = i;
				}
			}
			for (j = length - 1;j >= k + 1;j--)
			{
				str = tangible.StringFunctions.changeCharacter(str, j + 3, str.charAt(j));
			}
			str = tangible.StringFunctions.changeCharacter(str, k + 1, substr.charAt(0));
			str = tangible.StringFunctions.changeCharacter(str, k + 2, substr.charAt(1));
			str = tangible.StringFunctions.changeCharacter(str, k + 3, substr.charAt(2));
			for (p = 0;p < length + 3;p++)
			{
				System.out.printf("%c",str.charAt(p));
			}
			System.out.print("\n");
		}
	}
}

