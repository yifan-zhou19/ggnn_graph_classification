package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int t;
		int e;
		int i;
		int j;
		int k;
		int l;
		int p;
		int max = 0;
		int[] c = new int[501];
		String a = new String(new char[501]);
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0'}
		};
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
		m = a.length();
		for (j = 0;j < m - n + 1;j++)
		{
			for (i = 0;i < n;i++)
			{
				b[j][i] = a.charAt(j + i);
			}
		}
		for (k = 0;k < m - n + 1;k++)
		{
			for (l = k;l < m - n + 1;l++)
			{
				if (strcmp(b[k],b[l]) == 0)
				{
					c[k] = c[k] + 1;
				}
			}
			if (c[k] > max)
			{
				max = c[k];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (p = 0;p < m - n + 1;p++)
			{
				if (c[p] == max)
				{
					System.out.printf("%s\n",b[p]);
				}
			}
		}
		return 0;
	}
}

