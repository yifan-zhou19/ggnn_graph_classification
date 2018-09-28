package <missing>;

public class GlobalMembers
{
	public static char[][] zf = new char[1001][1001];
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	int k;
	int p = 0;

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
			zf[i] = tempVar2.charAt(0);
		}
	   // printf("%s\n",zf[i]);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	//printf("%d",m);
	for (k = 0;k < m - 1;k++)
	{
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < n;j++)
		{
		if (zf[i][j] == '.' && (zf[i - 1][j] == '@' || zf[i][j - 1] == '@' || zf[i + 1][j] == '@' || zf[i][j + 1] == '@'))
		{
			zf[i][j] = '*';
		}
		}
	  }
	 for (i = 0;i < n;i++)
	 {
		for (j = 0;j < n;j++)
		{
		if (zf[i][j] == '*')
		{
		zf[i][j] = '@';
		}
		}
	 }
		/* printf("%d\n",k);
		 for(i=0;i<n;i++){
		 	printf("%s\n",zf[i]);
		 }*/

	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			if (zf[i][j] == '@')
			{
			p++;
			}
		}
	}
	System.out.printf("%d\n",p);
	return 0;
	}
}

