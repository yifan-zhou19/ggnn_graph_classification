package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int p;
		int i;
		int k;
		int l;
		int n;
		int q;
		int d;
		int j;
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		char[][] re = new char[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2 = tempVar3.charAt(0);
			}
			k = s1.length();
			d = k;
			l = s2.length();
			for (;l > 0;l--)
			{
				if (s1.charAt(k - 1) >= s2.charAt(l - 1))
				{
					p = s1.charAt(k - 1) - s2.charAt(l - 1);
					s1 = tangible.StringFunctions.changeCharacter(s1, k - 1, p + 48);
				}
				else
				{
					for (q = k - 2;s1.charAt(q) == '0';q--)
					{
					  s1 = tangible.StringFunctions.changeCharacter(s1, q, '9');

					}
					s1 = tangible.StringFunctions.changeCharacter(s1, q, s1.charAt(q) - 1);
					p = 10 + (s1.charAt(k - 1) - s2.charAt(l - 1));
					s1 = tangible.StringFunctions.changeCharacter(s1, k - 1, p + 48);
				}
				k = k - 1;
			}
			for (q = 0;q < d;q++)
			{
				if (s1.charAt(q) != 0)
				{
					re[i][0] = s1.charAt(q);
					break;
				}
			}
			q = q + 1;
			for (j = 1;q < d;q++)
			{
				re[i][j] = s1.charAt(q);
			j++;
			}
			re[i][j] = '\0';

		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",re[i]);
		}


	}
}

