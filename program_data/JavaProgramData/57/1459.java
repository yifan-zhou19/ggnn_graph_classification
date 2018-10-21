package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		String s = new String(new char[30]);

		int len;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			if ((s.charAt(len - 1) == 'r') && (s.charAt(len - 2) == 'e'))
			{
				for (j = 0;j < len - 2;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
			}
			else if ((s.charAt(len - 1) == 'y') && (s.charAt(len - 2) == 'l'))
			{
				for (j = 0;j < len - 2;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
			}
			else
			{
				for (j = 0;j < len - 3;j++)
				{
				System.out.printf("%c",s.charAt(j));
				}
			}
			System.out.print("\n");
		}
	}


}

