package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		char[][] ori = new char[999][256];
		char[][] tra = new char[999][256];
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
				ori[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(ori[i]).length();
			for (j = 0;j < len;j++)
			{
				switch (ori[i][j])
				{
				case'A':
				tra[i][j] = 'T';
				break;
				case'T':
				tra[i][j] = 'A';
				break;
				case'G':
				tra[i][j] = 'C';
				break;
				case'C':
				tra[i][j] = 'G';
				}
			}
			tra[i][len] = '\0';
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",tra[i]);
		}

		return 0;
	}
}

