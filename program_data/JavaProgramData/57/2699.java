package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int j;
			int m;
			String s = new String(new char[100]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			m = s.length();
			if (s.charAt(m - 1) == 'r' || s.charAt(m - 1) == 'y')
			{
			for (j = 0;j < m - 2;j++)
			{
				System.out.printf("%c",s.charAt(j));
			}
			System.out.print("\n");
			}
			else
			{
			for (j = 0;j < m - 3;j++)
			{
				System.out.printf("%c",s.charAt(j));
			}
			System.out.print("\n");
			}
		}
	}


}

