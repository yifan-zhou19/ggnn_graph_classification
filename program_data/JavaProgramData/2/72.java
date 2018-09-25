package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] num = new int[1000];
		int m;
		int[][] a = new int[1000][26];
		int k;
		int[] sum = new int[26];
		int max = 0;
		int b;
		char[][] writer = new char[1000][26];
		char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 0;k < 26;k++)
		{
			sum[k] = 0;
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				a[i][j] = 0;
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				writer[i] = tempVar3.charAt(0);
			}
		}
		for (k = 0;k < 26;k++)
		{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < 26;j++)
				{
					if (writer[i][j] == letter[k])
					{
						a[i][k]++;
					}
				}
			}
		}
		for (k = 0;k < 26;k++)
		{
			for (i = 0;i < m;i++)
			{
				sum[k] = sum[k] + a[i][k];
			}
		}
		for (k = 0;k < 26;k++)
		{
			if (max < sum[k])
			{
				max = sum[k];
				b = k;
			}
		}
		System.out.printf("%c\n%d\n",letter[b],max);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (writer[i][j] == letter[b])
				{
					System.out.printf("%d\n",num[i]);
				}
			}
		}
		return 0;
	}





}

