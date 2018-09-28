package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String words = new String(new char[200]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n;
		int k;
		int j = 0;
		int i;
		int s;
		int d;
		words = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = words.length();
		s = a.length();
		d = b.length();
		for (i = 0; i < n ; i++)
		{
			if (strncmp(words.Substring(i), a, s) == 0)
			{
				for (j = i,k = 0;k < d;j++,k++)
				{
					words = tangible.StringFunctions.changeCharacter(words, j, b.charAt(k));
				}
				break;
			}
		}
		System.out.println(words);
		return 0;
	}

}

