package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String s = new String(new char[100]);
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
			if (s.charAt(s.length() - 1) == 'r' || s.charAt(s.length() - 1) == 'y')
			{
				for (j = 0;j < s.length() - 2;j++)
				{
					System.out.printf("%c", s.charAt(j));
				}
				System.in.read();
				System.out.print("\n");
			}
			else
			{
				for (j = 0;j < s.length() - 3;j++)
				{
					System.out.printf("%c", s.charAt(j));
				}
				System.in.read();
				System.out.print("\n");
			}
		}
		return 0;
	}

}

