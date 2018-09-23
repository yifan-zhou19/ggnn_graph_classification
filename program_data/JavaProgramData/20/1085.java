package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String s = new String(new char[15]);
		int i;
		int j;
		int max;
		int l;
		int num;
		while (scanf("%s%s",str,substr) + 1)
		{
			max = 0;
			l = str.length();
			for (i = 0;i < l;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
					num = i;
				}
			}
				for (j = 0;j <= num;j++)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, str.charAt(j));
				}
				s = tangible.StringFunctions.changeCharacter(s, num + 1, substr.charAt(0));
				s = tangible.StringFunctions.changeCharacter(s, num + 2, substr.charAt(1));
				s = tangible.StringFunctions.changeCharacter(s, num + 3, substr.charAt(2));
				int n = num;
				for (j = num + 4;j <= l + 3;j++)
				{
					n++;
					s = tangible.StringFunctions.changeCharacter(s, j, str.charAt(n));
				}
				for (j = 0;j < l + 3;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				System.out.print("\n");
		}
	}

}

