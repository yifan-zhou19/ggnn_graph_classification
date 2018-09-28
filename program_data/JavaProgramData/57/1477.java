package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char num;
		String s = new String(new char[100]);
		char j;
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
			num = s.length();
			if (s.charAt(num - 2) == 'e' && s.charAt(num - 1) == 'r')
			{
				for (j = 0;j < num - 3;j++)
				{
				 System.out.printf("%c",s.charAt(j));
				}
				System.out.printf("%c\n",s.charAt(num - 3));
			}
			else if (s.charAt(num - 2) == 'l' && s.charAt(num - 1) == 'y')
			{
				for (j = 0;j < num - 3;j++)
				{
				 System.out.printf("%c",s.charAt(j));
				}
				System.out.printf("%c\n",s.charAt(num - 3));
			}
			else if (s.charAt(num - 3) == 'i' && s.charAt(num - 2) == 'n' && s.charAt(num - 1) == 'g')
			{
				for (j = 0;j < num - 4;j++)
				{
				 System.out.printf("%c",s.charAt(j));
				}
				System.out.printf("%c\n",s.charAt(num - 4));
			}
		}
		return 0;
	}


}

