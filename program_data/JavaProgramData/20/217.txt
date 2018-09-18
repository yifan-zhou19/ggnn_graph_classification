package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char c;
		String str = new String(new char[100]);
		String substr = new String(new char[100]);
		char x;
		int i;
		int j;
		int k;
		int s;
		int t;
		while (gets(a))
		{
			for (i = 0;(c = a.charAt(i)) != ' ';i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, a.charAt(i));
			}
			s = i + 1;
			k = 0;
			for (j = s;(c = a.charAt(j)) != '\0';j++)
			{
				substr = tangible.StringFunctions.changeCharacter(substr, k, a.charAt(j));
				k++;
			}
			x = str.charAt(0);
			for (i = 0;i < s - 1;i++)
			{
				if (str.charAt(i) > x)
				{
					t = i + 1;
					x = str.charAt(i);
				}
			}
				for (i = 0;i < t;i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
				for (j = 0;j < 3;j++)
				{
					System.out.printf("%c",substr.charAt(j));
				}
				for (i = t;i < s - 1;i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
				System.out.print("\n");
		}
				return 0;
	}
}

