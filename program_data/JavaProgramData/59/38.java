package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] hang = new int[10000];
		int[] lie = new int[10000];
		int day;
		int n;
		int m;
		int i;
		int j;
		int k;
		int total = 0;
		char[][] a = new char[101][101];
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
			  a[i] = tempVar2.charAt(0);
		  }
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (day = 1;day < m;day++)
		{
			k = 0;
		  for (i = 0;i < n;i++)
		  {
			for (j = 0;j < n;j++)
			{
			   if (a[i][j] == '@')
			   {
				  hang[k] = i;
				  lie[k] = j;
				  k++;
			   }
			}
		  }
		  for (i = 0;i < k;i++)
		  {
			if (a[hang[i] - 1][lie[i]] != '#')
			{
				a[hang[i] - 1][lie[i]] = '@';
			}
			if (a[hang[i] + 1][lie[i]] != '#')
			{
				a[hang[i] + 1][lie[i]] = '@';
			}
			if (a[hang[i]][lie[i] - 1] != '#')
			{
				a[hang[i]][lie[i] - 1] = '@';
			}
			if (a[hang[i]][lie[i] + 1] != '#')
			{
				a[hang[i]][lie[i] + 1] = '@';
			}
		  }
		}
		for (i = 0;i < n;i++)
		{
		  for (j = 0;j < n;j++)
		  {
			 if (a[i][j] == '@')
			 {
				 total += 1;
			 }
		  }
		}
		System.out.printf("%d",total);

	}


}

