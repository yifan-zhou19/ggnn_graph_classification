package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String s = new String(new char[21]);
		String x = new String(new char[99]);
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
			for (j = 0;s.charAt(j);j++)
			{
				if (!((s.charAt(j) == '_') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9' && j>0)))
				{
					x = x.substring(0, i);
					break;
				}
				else
				{
					x = tangible.StringFunctions.changeCharacter(x, i, 1);
				}
			}
		}


			for (i = 0;i < n;i++)
			{
				if (x.charAt(i) == 0)
				{
				System.out.print("no\n");
				}
				if (x.charAt(i) == 1)
				{
				System.out.print("yes\n");
				}
			}
		return 0;
	}

}

