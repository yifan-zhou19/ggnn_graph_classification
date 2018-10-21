package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String s = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		char[][] c = new char[500][5];
		int i;
		int[] count = new int[500];
		int j;
		int k;
		int t;
		int len;
		len = s.length();
		int m = 0;
		for (i = 0;i <= len - n;i++,m++)
		{
			k = i;
			for (j = 0;j < n;j++,k++)
			{
				c[m][j] = s.charAt(k);
			}
			c[m][j] = '\0';
			for (t = 0;t < m;t++)
			{
				if (strcmp(c[m],c[t]) == 0)
				{
					m--;
					count[t]++;
					break;
				}
			}
		}
		int max = count[0];
		for (j = 1;j < i;j++)
		{
			if (count[j] > max)
			{
				max = count[j];
			}
		}
		if (max == 0)
		{
			System.out.print("NO");
		}
		else
		{
				System.out.printf("%d\n",max + 1);
				for (j = 0;j < i;j++)
				{
					if (count[j] == max)
					{
						System.out.printf("%s\n",c[j]);
					}
				}
		}
	}

}

