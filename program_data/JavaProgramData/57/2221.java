package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String s = new String(new char[30]);
		char i;
		char l;
		char j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			if (s.charAt(l - 1) == 'y')
			{
				for (i = 0;i < l - 2;i++)
				{
					System.out.printf("%c",s.charAt(i));
				}
				System.out.print("\n");
			}
			if (s.charAt(l - 1) == 'g')
			{
				for (i = 0;i < l - 3;i++)
				{
					System.out.printf("%c",s.charAt(i));
				}
				System.out.print("\n");
			}
			if (s.charAt(l - 1) == 'r')
			{
				for (i = 0;i < l - 2;i++)
				{
					System.out.printf("%c",s.charAt(i));
				}
				System.out.print("\n");
			}


		}
	}



}

