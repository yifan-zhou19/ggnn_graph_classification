package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String s = new String(new char[1000]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			int l = s.length();
			s = tangible.StringFunctions.changeCharacter(s, l, '\0');
			int flag = 1;
			for (int j = 0;j < l;j++)
			{
				if (!((s.charAt(j) == '_') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9' && j > 0)))
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				System.out.print("yes\n");
			}
			else if (flag == 0)
			{
				System.out.print("no\n");
			}
		}
			return 0;
	}


}

