package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[10010]);
	public static int Main()
	{
		int[] a = new int[26];
		int i;
		int n;
		int j;
		int x;
		int t;
		int flag;
		char ch;
		String set = new String(new char[26]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				a[j] = 0;
			}
			j = 0;
			x = 0;
			flag = 0;
			while ((ch = System.in.read()) != '\n')
			{
				a[ch - 'a']++;
				s = tangible.StringFunctions.changeCharacter(s, j++, ch);
			}
			for (t = 0;t < 26;t++)
			{
				if (a[t] == 1)
				{
					set = tangible.StringFunctions.changeCharacter(set, x++, t + 'a');
				}
			}
			if (x == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				for (j = 0;s.charAt(j);j++)
				{
					for (x = 0;set.charAt(x);x++)
					{
						if (s.charAt(j) == set.charAt(x))
						{
							System.out.printf("%c\n",s.charAt(j));
							flag = 1;
							break;
						}
					}
					if (flag != 0)
					{
						break;
					}
				}
			}
		}
		return 0;
	}

}

