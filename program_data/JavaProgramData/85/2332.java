package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String l = new String(new char[max + 1]);
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
				l = tempVar2.charAt(0);
			}
			for (j = 0;j < l.charAt(j);j++)
			{
				if (!((l.charAt(j) == '_') || (l.charAt(j) >= 'A' && l.charAt(j) <= 'Z') || (l.charAt(j) >= 'a' && l.charAt(j) <= 'z') || (l.charAt(j) >= '0' && l.charAt(j) <= '9' && j>0)))
				{
				break;
				}
			}
			if (l.charAt(j) != null)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

