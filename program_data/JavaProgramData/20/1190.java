package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[14]);
		String a = new String(new char[4]);
		char max = 0;
		int n;
		int i;
		int k;
		int j;
		while (scanf("%s %s",s,a) != EOF)
		{
			k - 0;
			j = 0;
			max = 0;
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) > max)
			{
				k = i;
				max = s.charAt(i);
			}
		}

		for (i = n - 1;i > k;i--)
		{
			s = tangible.StringFunctions.changeCharacter(s, i + 3, s.charAt(i));
		}


		while (j <= 2)
		{
			s = tangible.StringFunctions.changeCharacter(s, k + j + 1, a.charAt(j));
			j++;
		}
		s = tangible.StringFunctions.changeCharacter(s, n + 3, '\0');
		System.out.println(s);
		}

	}




}

