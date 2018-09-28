package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] a = new int[502];
		String s = new String(new char[502]);
		char[][] t = new char[502][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		m = s.length();
		for (i = 0;i < m + 1 - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				t[i][j] = s.charAt(i + j);
			}
			t[i][j] = '\0';
		}
		for (i = 0;i < m + 1 - n;i++)
		{
			a[i] = 1;
		}
		for (i = 0;i < m + 1 - n;i++)
		{
			if (a[i] == 0)
			{
				continue;
			}
			for (j = i + 1;j < m + 1 - n;j++)
			{
				if (strcmp(t[i],t[j]) == 0)
				{
					a[i]++;
					a[j] = 0;
				}
			}
		}
		for (i = 0;i < m + 1 - n;i++)
		{
			if (a[i] > k)
			{
				k = a[i];
			}
		}
		if (k == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",k);
			for (i = 0;i < m + 1 - n;i++)
			{
				if (a[i] == k)
				{
					System.out.printf("%s\n",t[i]);
				}
			}
		}
	}

}

