package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int[] x = new int[110];
		int k;
		int[] x2 = new int[110];
		char[][] id = new char[110][20];
		String temp = new String(new char[20]);
		char[][] id2 = new char[100][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
			if (x[i] >= 60)
			{
				k++;
				x2[k] = x[i];
				id2[k] = id[i];
			}
		}
		for (i = 1;i <= k;i++)
		{
			for (j = k;j > i;j--)
			{
				if (x2[j] > x2[j - 1])
				{
					t = x2[j];
					x2[j] = x2[j - 1];
					x2[j - 1] = t;
					temp = id2[j];
					id2[j] = id2[j - 1];
					id2[j - 1] = temp;
				}
			}
		}
		for (i = 1;i <= k;i++)
		{
			System.out.printf("%s\n", id2[i]);
		}
		for (i = 1;i <= n;i++)
		{
			if (x[i] < 60)
			{
				System.out.printf("%s\n", id[i]);
			}
		}

		return 0;
	}


}

