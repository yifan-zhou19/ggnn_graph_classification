package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] num = new int[500];
		int max = 0;
		int l;
		int j;
		int k;
		String c = new String(new char[501]);
		char[][] str = new char[500][6];
		char[][] str2 = new char[500][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		l = c.length();
		for (i = 0;i <= l - n;i++)
		{
			j = 0;
			for (k = i;k <= i + n - 1;k++)
			{
				str[i][j] = str2[i][j] = c.charAt(k);
				j++;
			}
			str[i][j] = str2[i][j] = '\0';
		}
		for (i = 0;i <= l - n;i++)
		{
			if (str[i][0] != '\0')
			{
				for (k = i;k <= l - n;k++)
				{
					if (str[k][0] != '\0')
					{
						if (strcmp(str2[i],str[k]) == 0)
						{
							num[i] = num[i] + 1;
							str[k][0] = '\0';
						}
					}
				}
			}
		}
		for (i = 0;i <= l - n;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		if (max <= 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= l - n;i++)
			{
				if (num[i] == max)
				{
					System.out.printf("%s\n",str2[i]);
				}
			}
		}
	}

}

