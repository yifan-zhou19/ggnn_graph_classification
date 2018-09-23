package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] num = new int[1000];
		int[] len = new int[1000];
		int[][] num1 = new int[1000][26];
		int[] sum = new int[26];
		int max = 0;
		int m;
		char[][] writer = new char[1000][26];
		char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
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
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				writer[i] = tempVar3.charAt(0);
			}
			len[i] = String.valueOf(writer[i]).length();
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < len[j];k++)
				{
					if (writer[j][k] == letter[i])
					{
						num1[j][i]++;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < n;j++)
			{
			   sum[i] = sum[i] + num1[j][i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max < sum[i])
			{
				max = sum[i];
				m = i;
			}
		}
		System.out.printf("%c\n%d\n",letter[m],sum[m]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (writer[i][j] == letter[m])
				{
					System.out.printf("%d\n",num[i]);
				}
			}
		}
		return 0;
	}
}

