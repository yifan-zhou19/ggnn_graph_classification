package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int x;
		int maxnumber;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[1000];
		char[][] k = new char[1000][30];
		int[] author = new int[27];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				k[i] = tempVar3.charAt(0);
			}
			int m;
			m = String.valueOf(k[i]).length();
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
		for (i = 1;i <= n;i++)
		{
						 for (l = 0;l <= String.valueOf(k[i]).length();l++)
						 {
						 if (k[i][l] == who)
						 {
						 System.out.printf("%d\n",a[i]);
						 }
						 }
		}
		return 0;
	}
}

