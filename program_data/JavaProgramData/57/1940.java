package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		int n;
		int len;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0; j < n; j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			if (s.charAt(len - 2) == 'e' && s.charAt(len - 1) == 'r' || s.charAt(len - 2) == 'l' && s.charAt(len - 1) == 'y')
			{
				for (i = 0; i < len - 2; i++)
				{
					System.out.printf("%c", s.charAt(i));
				}
			}
			else if (s.charAt(len - 3) == 'i' && s.charAt(len - 2) == 'n' && s.charAt(len - 1) == 'g')
			{
				for (i = 0;i < len - 3;i++)
				{
					System.out.printf("%c",s.charAt(i));
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

