package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int sum = 0;
		int i;
		String s = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (sum == 0)
			{
				System.out.printf("%s",s);
				sum = sum + (int)s.length();
			}
			else
			{
				if (sum + s.length() + 1 > 80)
				{
					sum = 0;
					System.out.printf("\n%s",s);
					sum = sum + (int)s.length();
				}
				else
				{
					sum = sum + (int)s.length() + 1;
					System.out.printf(" %s",s);
				}
			}
		}
		return 0;
	}
}

