package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int i;
		int j;
		int l1;
		int l2;
		int o = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		l1 = s1.length();
		l2 = s2.length();
		if (l1 == l2)
		{
			for (i = 0;s1.charAt(i) != '\0';i++)
			{
				for (j = 0;s2.charAt(j) != '\0';j++)
				{
									if (s2.charAt(j) == '0')
									{
										continue;
									}
					if (s1.charAt(i) == s2.charAt(j))
					{
						s2 = tangible.StringFunctions.changeCharacter(s2, j, '0');
						o++;
						break;
					}
				}
			}
				if (o == l1)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
		}
		else
		{
			System.out.print("NO\n");
		}
	}


}

