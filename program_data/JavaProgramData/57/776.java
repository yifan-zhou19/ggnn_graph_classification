package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int l;
		String s = new String(new char[MAX + 1]);
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
			for (j = 0;j < l;j++)
			{
				if (s.charAt(l - 1) == 'r' || s.charAt(l - 1) == 'y')
				{
					for (j = 0;j < l - 2;j++)
					{
					System.out.printf("%c",s.charAt(j));
					}
					break;
				}
				else if (s.charAt(l - 1) == 'g')
				{
					for (j = 0;j < l - 3;j++)
					{
					System.out.printf("%c",s.charAt(j));
					}
					break;
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

