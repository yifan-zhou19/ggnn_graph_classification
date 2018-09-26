package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		String s = new String(new char[50]);
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
			a = s.length();
			if ((s.charAt(a - 1) == 'r' && s.charAt(a - 2) == 'e') || (s.charAt(a - 1) == 'y' && s.charAt(a - 2) == 'l'))
			{
				 a = a - 2;
			}
			else if (s.charAt(a - 1) == 'g' && s.charAt(a - 2) == 'n' && s.charAt(a - 3) == 'i')
			{
				 a = a - 3;
			}
			for (int j = 0;j < a;j++)
			{
			   System.out.printf("%c",s.charAt(j));
			}
			System.out.print("\n");
		}
		 return 0;
	}
}

