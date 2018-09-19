package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[100][20];
		String p;
		String pp;
		String pr;
		String temp = new String(new char[3]);
		int i;
		int k;
		int m;
		int j;
		i = 0;
		while (gets(s[i]) != null)
		{
		i++;
		}
		k = i;
		for (j = 0;j <= k - 1;j++)
		{
			p = s[j];
			for (i = 0,m = p,pp = p;i <= 100;i++)
			{
				if (*(p.Substring(i)) > m)
				{
				pp = p.Substring(i);
				m = pp;
				}
				else if (*(p.Substring(i)) == ' ')
				{
					pr = p.Substring(i);
				break;
				}
			}
			temp = tangible.StringFunctions.changeCharacter(temp, 0, *(pr.Substring(1)));
			temp = tangible.StringFunctions.changeCharacter(temp, 1, *(pr.Substring(2)));
			temp = tangible.StringFunctions.changeCharacter(temp, 2, *(pr.Substring(3)));
			for (i = 1;i <= pr - pp - 1;i++)
			{
				*(pr - i + 3) = *(pr - i);
			}
			*(pp.Substring(1)) = temp.charAt(0);
			*(pp.Substring(2)) = temp.charAt(1);
			*(pp.Substring(3)) = temp.charAt(2);
			*(p + String.valueOf(s[j]).length() - 1) = '\0';
			System.out.println(s[j]);
		}

	}

}

