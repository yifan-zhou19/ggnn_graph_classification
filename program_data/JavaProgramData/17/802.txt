package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			int j;
			int[] a = new int[1000];
			String s = new String(new char[1000]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int l = s.length();
			System.out.printf("%s\n",s);

			for (j = 0;j < l;j++)
			{
				a[j] = 0;
			}
			for (j = l - 1;j >= 0;j--)
			{
				int t;
				if (s.charAt(j) == '(')
				{
					int f = 0;
					for (t = j + 1;t < l;t++)
					{
						if (s.charAt(t) == ')' && a[t] == 0)
						{
							f = 1;
							a[t] = 1;
							a[j] = 1;
							break;
						}
					}
					if (f == 0)
					{
						s = tangible.StringFunctions.changeCharacter(s, j, '$');
					}
				}
			}
			for (j = 0;j < l;j++)
			{
				if (s.charAt(j) == ')' && a[j] == 0)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, '?');
				}
			}
			for (j = 0;j < l;j++)
			{
				if (s.charAt(j) != '?' && s.charAt(j) != '$')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, ' ');
				}
			}
			System.out.printf("%s\n",s);
		}
	}
}

