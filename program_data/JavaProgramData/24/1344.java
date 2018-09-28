package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		char[][] word = new char[51][30];
		s = new Scanner(System.in).nextLine();
		int[] a = new int[51];
		int i;
		int j = 0;
		int k = 0;
		int n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				word[j] = (s.Substring(k));
				j++;
				k = i + 1;
			}
		}
		word[j] = (s.Substring(k));
		j++;
		for (i = 0;i < j;i++)
		{
			a[i] = String.valueOf(word[i]).length();
		}
		int max = a[0];
		int min = a[0];
		int w = 0;
		int e = 0;
		for (i = 1;i < j;i++)
		{
			if (max < a[i])
			{
				max = a[i];
				w = i;
			}
			if (min > a[i])
			{
				min = a[i];
				e = i;
			}
		}
		System.out.printf("%s\n",word[w]);
		System.out.printf("%s\n",word[e]);
		return 0;
	}
}

