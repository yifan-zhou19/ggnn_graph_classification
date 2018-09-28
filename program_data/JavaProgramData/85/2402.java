package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a = 0;
		String s = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int t1 = 1;
			int t2 = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (s.charAt(0) == '_' || (s.charAt(0) <= 'Z' && s.charAt(0) >= 'A') || (s.charAt(0) <= 'z' && s.charAt(0) >= 'a'))
			{
				t1 = 1;
			}
			else
			{
				t1 = 0;
			}
			for (j = 1;s.charAt(j);j++)
			{
				if (s.charAt(j) == '_' || (s.charAt(j) <= 'Z' && s.charAt(j) >= 'A') || (s.charAt(j) <= 'z' && s.charAt(j) >= 'a') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))
				{
					a++;
				}
				else
				{
					t2 = 0;
				}
			}
			if (t1 == 1 && t2 == 1)
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

