package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int p;
		int q;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		char[][] c = new char[20][101];
		String s;
		String d = new String(new char[5]);
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			d = new Scanner(System.in).nextLine();
			for (j = 0;j < (p = a.length());j++)
			{
				if (j < (q = b.length()))
				{
					if (a.charAt(p - 1 - j) < b.charAt(q - j - 1))
					{
						c[i][p - 1 - j] = 10 + a.charAt(p - 1 - j) - b.charAt(q - j - 1) + '0';
						a.charAt(p - 2 - j)--;
					}
					else
					{
						c[i][p - j - 1] = a.charAt(p - 1 - j) - b.charAt(q - j - 1) + '0';
					}
				}
				else
				{
					if (a.charAt(p - 1 - j) < '0')
					{
						c[i][p - j - 1] = 10 + a.charAt(p - 1 - j);
						a.charAt(p - j - 2)--;
					}
					else
					{
						c[i][p - j - 1] = a.charAt(p - 1 - j);
					}
				}
				c[i][p] = '\0';

			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < p;j++)
			{
				if (c[i][j] != '0')
				{
					s = c[i][j];
					break;
				}
			}
			System.out.printf("%s\n",s);
		}
	}
}

