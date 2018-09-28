package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int a;
		int j;
		int[] b = new int[27];
		int fl;
		String s = new String(new char[1000001]);
		String c = new String(new char[27]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			a = s.length();
			for (i = 0;i < 27;i++)
			{
			b[i] = 1;
			}
			for (i = 0,j = 0;i < a;i++)
			{
				if (s.charAt(i) == '0')
				{
				continue;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, j, s.charAt(i));
					for (m = i + 1;m < a;m++)
					{
						if (s.charAt(m) == s.charAt(i))
						{
							s = tangible.StringFunctions.changeCharacter(s, m, '0');
							b[j]++;
						}
					}
					j++;
				}
			}
			for (i = 0,fl = 0;i < j;i++)
			{
				if (b[i] == 1)
				{
					System.out.printf("%c\n",c.charAt(i));
					fl++;
					break;
				}
			}
			if (fl == 0)
			{
				System.out.print("no\n");
			}
				n--;
		}
	}
}

