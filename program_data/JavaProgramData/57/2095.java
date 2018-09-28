package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String s = new String(new char[100]);
		int m;
		int j;
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

			m = s.length();
			if (s.charAt(m - 1) == 'r' && s.charAt(m - 2) == 'e')
			{
				for (j = 0;j < m - 2;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				System.out.print("\n");
			}
			else if (s.charAt(m - 1) == 'y' && s.charAt(m - 2) == 'l')
			{
				for (j = 0;j < m - 2;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				System.out.print("\n");
			}
			else if (s.charAt(m - 1) == 'g' && s.charAt(m - 2) == 'n' && s.charAt(m - 3) == 'i')
			{
				for (j = 0;j < m - 3;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
				System.out.print("\n");
			}
		   else
		   {
			   System.out.printf("%s\n",s);
		   }
		}
	}
}

