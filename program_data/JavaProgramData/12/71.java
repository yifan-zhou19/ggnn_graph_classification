package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int b = 0;
		int[][] s = new int[100][16];
		int[] t = new int[100];
		int k;
		for (i = 0;;i++)
		{

			for (j = 0;;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
				if (s[i][j] == 0 || s[i][j] == -1)
				{
					break;
				}
				t[i]++;
			}
			if (s[i][j] == 0)
			{
				b++;
			}
			if (s[i][j] == -1)
			{
				break;
			}

		}
		for (i = 0;i < b;i++)
		{
			int sum = 0;
			for (j = 0;j < t[i];j++)
			{
				for (k = 0;k < t[i];k++)
				{
					if (s[i][j] == s[i][k] * 2)
					{
						sum++;
					}
				}
			}
		System.out.printf("%d\n",sum);
		}
	}


}

