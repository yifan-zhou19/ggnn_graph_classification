package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		int t;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[n][n];
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar2 != null)
				{
					(a[i][k]) = tempVar2.charAt(0);
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n > 1)
		{
		for (i = 1;i < m;i++)
		{

			 for (k = 0;k < n - 1;k++)
			 {
				for (t = 0;t < n;t++)
				{
					if ((a[k][t] == '@') && (a[k + 1][t] == '.'))
					{
						a[k + 1][t] = '*';
					}
				}
			 }
			 for (k = 1;k < n;k++)
			 {
				 for (t = 0;t < n;t++)
				 {
					 if ((a[k][t] == '@') && (a[k - 1][t] == '.'))
					 {
						 a[k - 1][t] = '*';
					 }
				 }
			 }
			 for (k = 0;k < n - 1;k++)
			 {
				 for (t = 0;t < n;t++)
				 {
					 if ((a[t][k] == '@') && (a[t][k + 1] == '.'))
					 {
						 a[t][k + 1] = '*';
					 }
				 }
			 }
			 for (k = 1;k < n;k++)
			 {
				 for (t = 0;t < n;t++)
				 {
					 if ((a[t][k] == '@') && (a[t][k - 1] == '.'))
					 {
						 a[t][k - 1] = '*';
					 }
				 }
			 }
			 for (k = 0;k < n;k++)
			 {
				 for (t = 0;t < n;t++)
				 {
					 if (a[k][t] == '*')
					 {
						 a[k][t] = '@';
					 }
				 }
			 }
		}
		}
		s = 0;
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (a[i][k] == '@')
				{
					s = s + 1;
				}
			}
		}
		System.out.printf("%d",s);
		return 0;
	}

}

