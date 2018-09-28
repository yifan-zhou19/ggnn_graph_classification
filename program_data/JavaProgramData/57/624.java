package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int j;
		String dc = new String(new char[52]);
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
				dc = tempVar2.charAt(0);
			}
			a = dc.length();
			if (dc.charAt(a - 1) == 'r' || dc.charAt(a - 1) == 'y')
			{
				for (j = 0;j < a - 2;j++)
				{
					if (j < a - 3)
					{
						System.out.printf("%c",dc.charAt(j));
					}
					else
					{
						System.out.printf("%c\n",dc.charAt(j));
					}
				}
			}
			else if (dc.charAt(a - 1) == 'g')
			{
				for (j = 0;j < a - 3;j++)
				{
					if (j < a - 4)
					{
						System.out.printf("%c",dc.charAt(j));
					}
					else
					{
						System.out.printf("%c\n",dc.charAt(j));
					}
				}
			}
		}
		return 0;
	}

}

