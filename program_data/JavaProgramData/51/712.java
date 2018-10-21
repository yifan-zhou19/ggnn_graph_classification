package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] count = new int[500];
		int max = 1;
		for (i = 0;i < 500;i++)
		{
			count[i] = 1;
		}

		String str = new String(new char[501]);
		char[][] substr = new char[500][5];
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
		m = str.length();

		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				substr[i][j] = str.charAt(i + j);
			}
			substr[i][n] = '\0';
		}

		for (i = 0;i <= m - n;i++)
		{
			for (j = i + 1;j <= m - n;j++)
			{
				if (strcmp(substr[i],substr[j]) == 0)
				{
					count[i] = count[i] + 1;
				}
			}
			if (count[i] > max)
			{
				max = count[i];
			}

		}

		if (max != 1)
		{

		System.out.printf("%d\n",max);

		for (i = 0;i <= m - n;i++)
		{
			if (count[i] == max)
			{
				System.out.printf("%s\n",substr[i]);
			}
		}
		}
		else
		{
			System.out.print("NO\n");
		}




		return 0;
	}

}

