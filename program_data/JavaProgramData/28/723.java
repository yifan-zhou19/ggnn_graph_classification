package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		char[][] ss = new char[200][50];
		int[] sz = new int[200];
		s = new Scanner(System.in).nextLine();
		int i;
		int n = 0;
		int k = 0;
		for (i = 0;s.charAt(i) != 0;i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
				ss[n] = (s.Substring(k));
				sz[n] = String.valueOf(ss[n]).length();
				n++;
				k = i + 1;
			}
		}
		ss[n] = (s.Substring(k));
		sz[n] = String.valueOf(ss[n]).length();
		n++;
		for (i = 0;i < n - 1;i++)
		{
			if (sz[i] == 0)
			{
				continue;
			}
			else
			{
				System.out.printf("%d,",sz[i]);
			}
		}
		System.out.printf("%d",sz[n - 1]);
		return 0;
	}
}

