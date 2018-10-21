package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int j;
		int k;
		int[] time = new int[M];
		int max;
		int flag;
		String s = new String(new char[M]);
		String[] son = {""};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		n = s.length();
		for (i = 0;i <= n - len;i++)
		{
			for (j = i;j < i + len;j++)
			{
				son[i][j - i] = s.charAt(j);
			}
		}
		for (k = 0;k <= n - len;k++)
		{
			for (i = 0;i <= n - len;i++)
			{
				if (strcmp(son[k],son[i]) == 0)
				{
					time[k]++;
				}
			}
		}
		max = time[0];
		for (k = 0;k <= n - len;k++)
		{
			if (time[k] > max)
			{
				max = time[k];
			}
		}
		if (max > 1)
		{
		System.out.printf("%d\n",max);
		for (k = 0;k <= n - len;k++)
		{
			flag = 1;
			if (time[k] == max)
			{
				for (i = 0;i < k;i++)
				{
					if (strcmp(son[k],son[i]) == 0)
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					System.out.printf("%s\n",son[k]);
				}
			}
		}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}





}

