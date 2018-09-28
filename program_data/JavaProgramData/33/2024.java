package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int k = 0;
		char[][] jianji = new char[1000][1000];
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
				jianji[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < String.valueOf(jianji[i]).length();k++)
			{
				switch (jianji[i][k])
				{
				case 'T':
					jianji[i][k] = 'A';
					break;
				case 'A':
					jianji[i][k] = 'T';
					break;
				case 'G':
					jianji[i][k] = 'C';
					break;
				case 'C':
					jianji[i][k] = 'G';
					break;
				default:
					jianji[i][k] = 0;
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

