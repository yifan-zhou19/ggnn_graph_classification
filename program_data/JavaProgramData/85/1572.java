package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[21]);
		int i;
		int n;
		int j;
		String jg = new String(new char[100]);
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
				s = tempVar2.charAt(0);
			}
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				if ((s.charAt(j) == '_') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9' && j>0))
				{
					continue;
				}
				else
				{
					break;
				}
			}
			jg = tangible.StringFunctions.changeCharacter(jg, i, s.charAt(j));
		}
		for (i = 0;i < n;i++)
		{
			if (jg.charAt(i) == '\0')
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

