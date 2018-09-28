package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		char[][] words = new char[100][101];
		int[] cd = new int[100];

		int i;
		int j;
		int k;
		int x = 0;
		int y = 0;
		int n;

		 s = new Scanner(System.in).nextLine();
		n = 0;
		k = 0;
		for (i = 0; s.charAt(i) != 0; i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				words[n] = (s.Substring(k));
				n++;
				k = i + 1;
			}
		}
		words[n] = (s.Substring(k));
		n++;

		for (i = 0;i < n;i++)
		{
			cd[i] = String.valueOf(words[i]).length();
		}

		k = j = cd[0];

		for (i = 1;i < n;i++)
		{
			if (cd[i] > k)
			{
				k = cd[i];
				x = i;
			}
			else if (cd[i] < j)
			{
				y = i;
				j = cd[i];
			}
		}
		System.out.printf("%s\n%s",words[x],words[y]);
		return 0;




	}
}

