package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[501]);
		char[][] b = new char[500][6];
		int n;
		int i;
		int j;
		int len;
		int[] c = new int[500];
		int max;
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
		len = a.length();
		for (i = 0;i <= len;i++)
		{
			c[i] = 1;
		}
		for (i = 0;i <= len - n;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
			b[i][j] = '\0';
		}
		for (i = 0;i <= len - n - 1;i++)
		{
			b[i] = b[i];
		}
		for (i = 0;i <= len - n - 1;i++)
		{
			for (j = i + 1;j <= len - n;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					c[i]++;
				}
			}
		}
		max = c[0];
		for (i = 1;i <= len - n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= len - n;i++)
			{
			if (c[i] == max)
			{
				System.out.printf("%s\n",b[i]);
			}
			}
		}

	}
}

