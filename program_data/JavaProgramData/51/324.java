package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
		char[][] s = new char[1001][1001];
		int n;
		int i;
		int j;
		int k = 0;
		int m;
		int[] a = new int[1001];
		int t = 0;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		m = str.length() - n;
		for (i = 0;i <= m;i++)
		{
			for (j = 0;j < n;j++)
			{
				s[i][j] = str.charAt(i + j);
			}
		}
		for (i = 0;i <= m;i++)
		{
			for (j = i;j <= m;j++)
			{
				if (strcmp(s[j],s[i]) == 0)
				{
					a[i]++;
				}
			}
		}
		for (i = 0;i <= m;i++)
		{
			if (a[i] > t)
			{
				t = a[i];
			}
		}
		p = 0;
		for (i = 0;i < m;i++)
		{
		   for (j = 0;j < m;j++)
		   {
			  if (a[i] != a[j])
			  {
			  p = 1;
			  break;
			  }
		   }
		}
		if (p == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
		System.out.printf("%d\n",t);
		for (i = 0;i <= m;i++)
		{
			if (a[i] == t)
			{
				for (j = 0;j < i;j++)
				{
					if (strcmp(s[i],s[j]) == 0)
					{
						k = 1;
					}
				}
				if (k == 0)
				{
					System.out.printf("%s\n",s[i]);
				}
			}
		}
		}
	}
}

