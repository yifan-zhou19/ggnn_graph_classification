package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int i;
		int j;
		int k;
		char[][] sf = new char[50][100];
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
				sf[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			a = String.valueOf(sf[i]).length();
			for (j = 0;j < a;j++)
			{
			if ((sf[i][a - 2] == 'e' && sf[i][a - 1] == 'r') || (sf[i][a - 2] == 'l' && sf[i][a - 1] == 'y'))
			{
				sf[i][a - 2] = '\0';
			}
			}
			if (sf[i][a - 3] == 'i' && sf[i][a - 2] == 'n' && sf[i][a - 1] == 'g')
			{
				sf[i][a - 3] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",sf[i]);
		}
		return 0;
	}
}

