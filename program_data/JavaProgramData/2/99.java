package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int x;
		int maxnumber;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] booknum = new int[1000];
		char[][] k = new char[1000][30];
		int[] author = new int[27];
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				booknum[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				k[i] = tempVar3.charAt(0);
			}
			for (j = 0;k[i][j] != '\0';j++)
			{
				author[k[i][j] - 'A' + 1]++;
			}
		}
		int max = 0;
		for (i = 1;i <= 26;i++)
		{
			if (author[i] > max)
			{
				max = author[i];
				maxnumber = i;
			}
		}
		char who;
		who = 'A' + maxnumber - 1;
		System.out.printf("%c\n",who);
		System.out.printf("%d\n",max);
		for (i = 1;i <= m;i++)
		{
						 for (j = 0;j < String.valueOf(k[i]).length();j++)
						 {
						 if (k[i][j] == who)
						 {
						 System.out.printf("%d\n",booknum[i]);
						 }
						 }
		}
		return 0;
	}

}

