package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int j;
		int n;
		int i;
		String s = new String(new char[32]);
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
					break;
				}
			}
			if (s.charAt(j) != null)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
	}
}

