package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String c = new String(new char[550]);
		String a = new String(new char[5]);
		char[][] str = new char[550][5];
		int[] num = new int[550];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		int l = c.length();
		int i;
		int j;
		for (i = 0;i < l - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				str[i][j] = c.charAt(i + j);
			}
			str[i][n] = '\0';
		}
		int max = 0;
		for (i = 0;i < l - n + 1;i++)
		{
			for (j = i;j < l - n + 1;j++)
			{
				if (strcmp(str[i],str[j]) == 0)
				{
					num[i]++;
				}
			}
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.printf("%d\n",max);
		for (i = 0;i < l - n + 1;i++)
		{
			if (num[i] == max)
			{
				System.out.printf("%s\n",str[i]);
			}
		}





	}


}

