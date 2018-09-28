package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int p;
		int l;
		int k;
		int q;
		char[][] s1 = new char[100][100];
		char[][] s2 = new char[100][100];
		String a = new String(new char[100]);
		String t = new String(new char[100]);
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
				s1[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2[i] = tempVar3.charAt(0);
			}
		}

		for (i = 0;i < n;i++)
		{
			l = 0;
			p = String.valueOf(s1[i]).length();
			q = String.valueOf(s2[i]).length();
			for (j = p - q - 1;j < p;j++)
			{
				t = tangible.StringFunctions.changeCharacter(t, l++, s1[i][j]);
			}
			for (j = q;j >= 1;j--)
			{
				if (t.charAt(j) >= s2[i][j - 1])
				{
					 a = tangible.StringFunctions.changeCharacter(a, j, (t.charAt(j) - s2[i][j - 1]));
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, (t.charAt(j) + 10 - s2[i][j - 1]));
					t = tangible.StringFunctions.changeCharacter(t, j - 1, t.charAt(j - 1) - 1);
				}
			}
				a = tangible.StringFunctions.changeCharacter(a, 0, t.charAt(0) - '0');
				for (k = 0;k < p - 1 - q;k++)
				{
						System.out.printf("%c",s1[i][k]);
				}
				for (k = 0;k <= q;k++)
				{
					System.out.printf("%d",a.charAt(k));
				}
				System.out.print("\n");
		}
	}
}

