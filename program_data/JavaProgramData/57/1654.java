package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		int n;
		int i;
		int m;
		int j;
		int l;
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
			l = s.length();
			if (s.charAt(l - 1) == 'r')
			{
				m = l - 2;
			}
			else if (s.charAt(l - 1) == 'y')
			{
				m = l - 2;
			}
			else if (s.charAt(l - 1) == 'g')
			{
				m = l - 3;
			}

		for (j = 0;j < m;j++)
		{
				System.out.printf("%c",s.charAt(j));
		}
		System.out.print("\n");
		}

		return 0;
	}
}

