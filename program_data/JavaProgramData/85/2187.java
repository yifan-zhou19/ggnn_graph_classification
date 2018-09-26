package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int a = 1;
		String s = new String(new char[MAX + 1]);
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
				if ((s.charAt(j) == '_') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9' && j>0))
				{
					continue;
				 a = 1;
				}
				else
				{
					a = 0;
					break;
				}

			}
			if (a == 0)
			{
				 System.out.print("no\n");
			}
			else if (a == 1)
			{
				 System.out.print("yes\n");
			}
	  a = 1;
		}
			return 0;
	}



}

