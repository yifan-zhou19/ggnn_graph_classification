package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		int i = 0;
		int ns1;
		int ns2;
		int tag = 1;
		int flag = 1;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		ns1 = s1.length();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		ns2 = s2.length();
		if (ns2 != ns1)
		{
			tag = 0;
		}
		else
		{
			for (i = 0;i < ns1;i++)
			{
				flag = 1;
				for (j = 0;j < ns2;j++)
				{
					if (s1.charAt(i) == s2.charAt(j))
					{
						s2 = tangible.StringFunctions.changeCharacter(s2, j, '0');
						flag = 0;
						break;
					}
				}
			}
		}
		if (flag != 0)
		{
			tag = 0;
		}
		if (tag != 0)
		{
			System.out.print("YES");
		}
			else
			{
				System.out.print("NO");
			}
		return 0;
	}
}

