package <missing>;

public class GlobalMembers
{
	/*?????????n?????n????????? 
	????n??????????????????
	????????????A?T?G?C??????????????????????
	????????????255?*/
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] jianji = new char[1000][256];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jianji[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 255;j++)
			{
				switch (jianji[i][j])
				{
				case 'A':
					jianji[i][j] = 'T';
					break;
				case 'T':
					jianji[i][j] = 'A';
					break;
				case 'C':
					jianji[i][j] = 'G';
					break;
				case 'G':
					jianji[i][j] = 'C';
					break;
				case '\0':
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",jianji[i]);
		}
		return 0;
	}
}

