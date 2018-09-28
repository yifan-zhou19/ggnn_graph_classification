package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[500][500];
		char[][] t = new char[500][500];
		int k;
		int flag;
		int l;
		int max;
		int[] x = new int[500];
		String a = new String(new char[500]);
		int i;
		int n;
		int c;
		int j;
		int zichuanshu;
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
		c = a.length();
		for (i = 0;i <= c - n;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				s[i][j] = a.charAt(i + j);
			}
		}
		zichuanshu = i;
		for (j = 0;j < n;j++)
		{
			t[0][j] = s[0][j];
		}
		k = 1;
		x[0] = 0;
		for (i = 1;i < zichuanshu;i++)
		{
			for (l = 0;l < k;l++)
			{
				flag = 0;
				for (j = 0;j < n;j++)
				{
					if (s[i][j] != t[l][j])
					{
					flag = 1;
					}
				}
				if (flag == 0)
				{
					x[l]++;
					break;
				}
			}
				if (flag == 1)
				{
					for (j = 0;j < n;j++)
					{
						t[k][j] = s[i][j];
					}

						k++;
				}

		}
		max = x[0];
		for (i = 1;i < k - 1;i++)
		{
			if (x[i] > max)
			{
				max = x[i];
			}
		}
		if (max == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max + 1);
			for (i = 0;i <= k - 1;i++)
			{
				if (x[i] == max)
				{
					for (j = 0;j < n - 1;j++)
					{
						System.out.printf("%c",t[i][j]);
					}
					System.out.printf("%c\n",t[i][n - 1]);
				}
			}
		}
	}
}

