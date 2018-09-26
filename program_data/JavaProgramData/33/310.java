package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			for (int j = 0; j < s.length(); j++)
			{
				if (j < s.length() - 1 && s.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				if (j < s.length() - 1 && s.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				if (j < s.length() - 1 && s.charAt(j) == 'G')
				{
					System.out.print("C");
				}
				if (j < s.length() - 1 && s.charAt(j) == 'C')
				{
					System.out.print("G");
				}
				if (j == s.length() - 1)
				{
					if (s.charAt(j) == 'A')
					{
						System.out.print("T\n");
					}
					if (s.charAt(j) == 'T')
					{
						System.out.print("A\n");
					}
					if (s.charAt(j) == 'G')
					{
						System.out.print("C\n");
					}
					if (s.charAt(j) == 'C')
					{
						System.out.print("G\n");
					}
				}
			}
		}
		return 0;
	}


}

