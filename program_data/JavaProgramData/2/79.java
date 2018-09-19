package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] a = new int[1000];
		int i;
		int n;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		char[][] b = new char[1000][27];
		int[] count = new int[26];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			n = String.valueOf(b[i]).length();
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (b[i][j] == k + 65)
					{
						count[k]++;
					}
				}
			}
		}
		int max;
		int maxk;
		max = count[0];
		maxk = 0;
		for (k = 0;k < 26;k++)
		{
			if (count[k] > max)
			{
				max = count[k];
				maxk = k;
			}
		}
		char mauthor;
		mauthor = maxk + 65;
		System.out.printf("%c\n%d\n",mauthor,max);
		for (i = 0;i < m;i++)
		{
			n = String.valueOf(b[i]).length();
			for (j = 0;j < n;j++)
			{
					if (b[i][j] == mauthor)
					{
						System.out.printf("%d\n",a[i]);
						break;
					}

			}
		}
		return 0;
	}

}

