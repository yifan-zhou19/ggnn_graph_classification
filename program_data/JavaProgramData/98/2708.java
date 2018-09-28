package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[300][300];
		int n;
		int i;
		int l;
		int x = 0;
		int j;
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
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(s[i]).length();
			x += l;
			if (x == 80)
			{
				System.out.printf("%s\n",s[i]);
				x = 0;
			}
			else if (x > 80)
			{
				if (i == n - 1)
				{
					System.out.printf("\n%s\n",s[i]);
				}
				else
				{
				System.out.printf("\n%s ",s[i]);
				}
				x = l + 1;
			}
			else
			{
				j = String.valueOf(s[i + 1]).length();
				if (i == n - 1)
				{
					System.out.printf("%s\n",s[i]);
				}
				else
				{
					if (x + j + 1 > 80)
					{
						System.out.printf("%s",s[i]);
					}
					else
					{
						System.out.printf("%s ",s[i]);
					}
				}
				x += 1;
			}
		}
		return 0;
	}

}

