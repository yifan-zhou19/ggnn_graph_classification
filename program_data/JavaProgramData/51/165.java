package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[500][5];
		String x = new String(new char[500]);
		int i;
		int n;
		int len;
		int j;
		int[] num = new int[500];
		int maxn = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		len = x.length();
		for (i = 0;i <= len - n;i++) //????????0~len-n,????a[0~len-n][]?????//
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = x.charAt(i + j);
			}
			a[i][n] = '\0';
		}
		for (i = 0;i <= len - n;i++)
		{
			num[i] = 1;
			for (j = i + 1;j <= len - n;j++)
			{
				if (strcmp(a[i],a[j]) == 0)
				{
					num[i]++;
				}
			}
		}
		for (i = 0;i <= len - n;i++)
		{
			if (num[i] > maxn)
			{
				maxn = num[i];
			}
		}
		if (maxn == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",maxn);
			for (i = 0;i <= len - n;i++)
			{
				if (num[i] == maxn)
				{
					System.out.printf("%s\n",a[i]);
				}
			}
		}
	}





}

