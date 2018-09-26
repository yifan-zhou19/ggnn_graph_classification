package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		int l;
		int j;
		String a = new String(new char[35]);
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
			if ((a.charAt(l - 1) == 'y' && a.charAt(l - 2) == 'l') || (a.charAt(l - 1) == 'r' && a.charAt(l - 2) == 'e'))
			{
			for (j = 0;j <= l - 3;j++)
			{
				if (j < l - 3)
				{
					System.out.printf("%c",a.charAt(j));
				}
				if (j == l - 3)
				{
					System.out.printf("%c\n",a.charAt(j));
				}
			}
			}
			else if ((a.charAt(l - 1) == 'g' && a.charAt(l - 2) == 'n' && a.charAt(l - 3) == 'i'))
			{
				for (j = 0;j < l - 3;j++)
				{
					if (j < l - 4)
					{
					System.out.printf("%c",a.charAt(j));
					}
				if (j == l - 4)
				{
					System.out.printf("%c\n",a.charAt(j));
				}
				}
			}
		}




		return 0;
	}




}

