package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int[][] s = new int[100][100];
		int[] n = new int[100];
		int[] m = new int[100];
		int[] num = new int[100];
		int[] num1 = new int[100];
		int[] num2 = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < n[i];j++)
			{
				for (l = 0;l < m[i];l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						s[j][l] = Integer.parseInt(tempVar4);
					}
					num1[i] += s[j][l];
				}
			}
			for (j = 1;j < n[i] - 1;j++)
			{
				for (l = 1;l < m[i] - 1;l++)
				{
					num2[i] += s[j][l];
				}
			}
			num[i] = num1[i] - num2[i];

		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",num[i]);
		}




	return 0;
	}


}

