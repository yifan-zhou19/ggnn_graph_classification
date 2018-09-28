package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[500]);
		String substring = new String(new char[500]);
		String replacement = new String(new char[500]);
		char temp;
		String str = new String(new char[500]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int len0;
		int len1;
		int len2;
		String = new Scanner(System.in).nextLine();

		substring = new Scanner(System.in).nextLine();

		replacement = new Scanner(System.in).nextLine();

		len1 = substring.length();

		len2 = replacement.length();

		len0 = String.length();

		str = String;

		for (i = 0;i < len0;i++)
		{
			if (String[i] == substring.charAt(0))
			{
			  for (j = 1;j < len1;j++)
			  {
				if (String[i + 1] == substring.charAt(j))
				{
					i++;
				}
				else
				{
					j = 0;
					break;
				}
			  }

			  if (j == len1)
			  {
				k = i;
				for (i;i < len0 - len1 + len2;i++)
				{
					str = tangible.StringFunctions.changeCharacter(str, i - len1 + len2, string.charAt(i));
				}
				for (l = 0;l < len2;l++)
				{
					str = tangible.StringFunctions.changeCharacter(str, k - len2 + 1 + l, replacement.charAt(l));
				}
			  }
			else
			{
				m = 0;
			}
			}
		}

		System.out.println(str);
		 return 0;
	}
}

