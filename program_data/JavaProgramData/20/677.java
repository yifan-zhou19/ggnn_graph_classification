package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[20]);
		String sub = new String(new char[10]);
		int i;
		int j;
		int k;
		int ls;
		int lsub;
		while (scanf("%s%s",s,sub) != EOF)
		{
			ls = s.length();
			lsub = sub.length();
			k = 0;
			for (i = 1;i < ls;i++)
			{
				if (s.charAt(i) > s.charAt(k))
				{
					k = i;
				}
			}
			for (i = ls;i > k;i--)
			{
				s = tangible.StringFunctions.changeCharacter(s, i + lsub, s.charAt(i));
			}
			for (i = k + 1,j = 0;j < lsub;i++,j++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, sub.charAt(j));
			}
		System.out.printf("%s\n",s);
		}
	}
}

