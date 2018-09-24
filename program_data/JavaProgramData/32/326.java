package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		char[][] r = new char[100][101];
		int i;
		int j;
		int k;
		int n;
		int c;
		int la;
		int lb;
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
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			la = a.length();
			lb = b.length();
			c = la - lb;
			r[i][la] = '\0';
			for (j = la - 1;j >= 0;j--)
			{
				if (j >= la - lb)
				{
					if (a.charAt(j) >= b.charAt(j - c))
					{
						r[i][j] = a.charAt(j) - b.charAt(j - c) + '0';
					}
					else
					{
						r[i][j] = 10 + a.charAt(j) - b.charAt(j - c) + '0';
						k = j - 1;
						while (a.charAt(k) == '0')
						{
							a = tangible.StringFunctions.changeCharacter(a, k, '9');
							k--;
						}
						a.charAt(k)--;
					}
				}
				else
				{
					r[i][j] = a.charAt(j);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
				System.out.printf("%s\n",r[i]);
		}
	}
}

