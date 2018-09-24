package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		char[][] b = new char[501][501];
		char[][] d = new char[501][501];
		String str = new String(new char[501]);
		int n;
		int i;
		int j;
		int p = 0;
		int q = 0;
		int[] c = new int[501];
		int k = 0;
		int l;
		int s;
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
		for (i = 0;i < 501;i++)
		{
			c[i] = 1;
		}
		for (i = 0;i < a.length() - n + 1;i++)
		{
			for (j = i;j < n + i;j++)
			{
				b[p][q] = a.charAt(j);
				q++;
			}
			p++;
			q = 0;
		}
		for (i = 0;i < p;i++)
		{
			for (j = i + 1;j < p;j++)
			{
				if (strcmp(b[i],b[j]) == 0 && b[i][0] != '&')
				{
					c[k] += 1;
					for (s = 0;s < n;s++)
					{
						b[j][s] = '&';
					}
					d[k] = b[i];
				}
			}
			k++;
		}
		for (i = 1;i < k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (c[j] < c[j + 1])
				{
					l = c[j];
					c[j] = c[j + 1];
					c[j + 1] = l;
					str = d[j];
					d[j] = d[j + 1];
					d[j + 1] = str;
				}
			}
		}
		if (c[0] > 1)
		{
			System.out.printf("%d",c[0]);
			for (i = 0;i < k;i++)
			{
				if (c[i] == c[0])
				{
					System.out.printf("\n%s",d[i]);
				}
				else
				{
					break;
				}
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

