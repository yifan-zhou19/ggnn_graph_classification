package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int p;
		int m;
		String s = new String(new char[LEN]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			m = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			for (j = 0;s.charAt(j);j++)
			{
				p = 0;
				if (s.charAt(j) != 'A')
				{
					for (k = j + 1;s.charAt(k);k++)
					{
						if (s.charAt(k) == s.charAt(j))
						{
							p++;
							s = tangible.StringFunctions.changeCharacter(s, k, 'A');
						}
					}
					if (p == 0)
					{
						System.out.printf("%c\n",s.charAt(j));
						m = 1;
						break;
					}
				}
			}
			if (m == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

