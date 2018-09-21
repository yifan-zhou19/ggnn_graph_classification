package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String e = new String(new char[256]);
		String all = new String(new char[1000]);
		char[][] words = new char[50][256];
		int i;
		int j;
		int l;
		int len;
		int n = 0;
		int k = 0;
		all = new Scanner(System.in).nextLine();
		len = all.length();
		for (i = 0;i < len;i++)
		{
			if (all.charAt(i) == ' ')
			{
				all = tangible.StringFunctions.changeCharacter(all, i, '\0');
				words[n] = (all.Substring(k));
				n++;
				k = i + 1;
			}
		}
		words[n] = (all.Substring(k));
		for (j = 0;j < n;j++)
		{
			if (String.valueOf(words[j]).length() >= String.valueOf(words[j + 1]).length())
			{
				e = words[j + 1];
				words[j + 1] = words[j];
				words[j] = e;
			}
		}
		System.out.printf("%s\n",words[n]);
		for (l = 0;l < n;l++)
		{
			if (String.valueOf(words[l]).length() <= String.valueOf(words[l + 1]).length())
			{
				e = words[l + 1];
				words[l + 1] = words[l];
				words[l] = e;
			}
		}
		System.out.printf("%s\n",words[n]);
		return 0;
	}


}

