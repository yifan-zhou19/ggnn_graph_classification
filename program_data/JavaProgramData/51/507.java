package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		char[][] b = new char[501][5];
		int[] c = new int[501];
		int n;
		int i;
		int j;
		int k;
		int N;
		int sgn;
		int max = 0;
		int num;
		int xtz;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		N = a.length();
		for (j = 0;j < n;j++)
		{
			b[0][j] = a.charAt(j);
		}
		b[0][j] = 0;
		c[0]++;
		for (i = 1,k = 1;i < N - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[k][j] = a.charAt(i + j);
			}
			b[k][j] = 0;
			for (j = 0,sgn = 1;j < k;j++)
			{
				if (strcmp(b[j],b[k]) == 0)
				{
					sgn = 0;
					xtz = j;
					break;
				}
			}
			if (sgn != 0)
			{
				c[k]++;
				k++;
			}
			else
			{
				c[xtz]++;
			}
		}
		num = k - 1;
		for (i = 0;i <= num;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= num;i++)
			{
				if (c[i] == max)
				{
					System.out.printf("%s\n",b[i]);
				}
			}
		}
		return 0;
	}


}

