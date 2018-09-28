package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int l;
		final String a = "";
		final String b = "";
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
				a = tempVar2.charAt(0);
			}
			l = a.length();
			if (a.charAt(l - 1) == 'r' && a.charAt(l - 2) == 'e')
			{
				for (j = 0;j < l - 2;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
			else if (a.charAt(l - 1) == 'y' && a.charAt(l - 2) == 'l')
			{
				for (j = 0;j < l - 2;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
			else if (a.charAt(l - 1) == 'g' && a.charAt(l - 2) == 'n' && a.charAt(l - 3) == 'i')
			{
				for (j = 0;j < l - 3;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
			else
			{
				System.out.printf("%s\n",a);
			}
		}
	}
}

