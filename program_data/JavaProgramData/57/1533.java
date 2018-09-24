package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20]);
		String p;
		int n;
		int i;
		int l;
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
			p = a;
			l = a.length() - 1;
			if (*(p.Substring(l)) == 'r')
			{
				if (*(p.Substring(l) - 1) == 'e')
				{
				*(p.Substring(l)) = '\0';
				*(p.Substring(l) - 1) = '\0';
				}
			}
			else if (*(p.Substring(l)) == 'g')
			{
				if (*(p.Substring(l) - 1) == 'n')
				{
					if (*(p.Substring(l) - 2) == 'i')
					{
						 *(p.Substring(l)) = '\0';
						 *(p.Substring(l) - 1) = '\0';
						 *(p.Substring(l) - 2) = '\0';
					}

				}
			}
			else if (*(p.Substring(l)) == 'y')
			{
				if (*(p.Substring(l) - 1) == 'l')
				{
				*(p.Substring(l)) = '\0';
				}
				*(p.Substring(l) - 1) = '\0';
			}
			System.out.printf("%s\n",p);
		}
		return 0;
	}
}

