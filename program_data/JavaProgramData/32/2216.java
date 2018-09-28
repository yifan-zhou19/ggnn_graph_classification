package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int la;
		int lb;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		char[][] r = new char[100][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
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
			for (i = 0;i < la - lb;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '0');
			}
			c = c.substring(0, i);
			c += b;
			r[m][la] = 0;
			for (i = la - 1;i >= 0;i--)
			{
				if (a.charAt(i) >= c.charAt(i))
				{
					r[m][i] = a.charAt(i) - c.charAt(i) + '0';
				}
				else
				{
					r[m][i] = a.charAt(i) + 10 - c.charAt(i) + '0';
					for (j = i - 1;;j--)
					{
						if (a.charAt(j) > '0')
						{
							a.charAt(j)--;
							break;
						}
					 else
					 {
						 a = tangible.StringFunctions.changeCharacter(a, j, '9');
					 }
					}
				}
			}
		}
		for (m = 0;m < n;m++)
		{
			System.out.printf("%s\n",r[m]);
		}
	}
}

