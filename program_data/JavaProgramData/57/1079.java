package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] num = new char[100][288];
		String s = new String(new char[260]);
		int t;
		int a;
		int j;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (a = 0;a < t;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[a] = tempVar2.charAt(0);
			}
		}

		for (a = 0;a < t;a++)
		{
			s = num[a];
			int k = s.length();
			if (s.charAt(k - 1) == 'r' && s.charAt(k - 2) == 'e')
			{
				for (j = 0;j < k - 2;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
			}
			else if (s.charAt(k - 1) == 'y' && s.charAt(k - 2) == 'l')
			{
				for (j = 0;j < k - 2;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
			}
			else if (s.charAt(k - 1) == 'g' && s.charAt(k - 2) == 'n' && s.charAt(k - 3) == 'i')
			{
				for (j = 0;j < k - 3;j++)
				{
					System.out.printf("%c",s.charAt(j));
				}
			}
				else
				{
					System.out.printf("%s",s);
				}
			System.out.print("\n");

		}

		return 0;
	}


}

