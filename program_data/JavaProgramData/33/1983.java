package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		char[][] zfc = new char[1000][256];
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
				zfc[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(zfc[i]).length();
			for (k = 0;k < l;k++)
			{

				if (zfc[i][k] == 'A')
				{
				zfc[i][k] = 'T';
				}
			else if (zfc[i][k] == 'C')
			{
				zfc[i][k] = 'G';
			}
			else if (zfc[i][k] == 'G')
			{
				zfc[i][k] = 'C';

			}
			else
			{
				zfc[i][k] = 'A';
			}
			}
			System.out.printf("%s\n",zfc[i]);
		}
			return 0;
	}
}

