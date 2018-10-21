package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		char[][] word = new char[50][100];
		String p;
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
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (p = word[i]; p != '\0';p++)
			{
				if (p == 'e' && *(p.Substring(1)) == 'r' && *(p.Substring(2)) == '\0')
				{
					p = '\0';
				}
				else if (p == 'l' && *(p.Substring(1)) == 'y' && *(p.Substring(2)) == '\0')
				{
					p = '\0';
				}
				else if (p == 'i' && *(p.Substring(1)) == 'n' && *(p.Substring(2)) == 'g' && *(p.Substring(3)) == '\0')
				{
					p = '\0';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",word[i]);
		}
		return 0;
	}


}

