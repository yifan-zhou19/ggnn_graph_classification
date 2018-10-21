package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] k = new int[505];
		int m;
		int p = 0;
		String a = new String(new char[505]);
		char[][] b = new char[505][7];
		char[][] c = new char[505][7];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (i = 0;a.charAt(i + n - 1) != '\0';i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
			b[i][n] = '\0';

		}
		m = a.length() - n + 1;
		for (i = 0;i < m;i++)
		{
			if (strcmp(b[i],"\0") != 0)
			{
				c[p] = b[i];
				p++;
			}
			for (j = i + 1;j < m;j++)
			{
				if (strcmp(c[p - 1],b[j]) == 0)
				{
					k[p - 1]++;
					b[j] = "\0";

				}
			}
		}
		int max = 0;
		for (i = 0;i < p;i++)
		{
			if (k[i] > max)
			{
				max = k[i];
			}
		}
		if (max + 1 == 1)
		{
			System.out.print("NO");
			return 0;
		}
		else
		{
			System.out.printf("%d\n",max + 1);
		}
		for (i = 0;i < p;i++)
		{
			if (k[i] == max)
			{
				System.out.printf("%s\n",c[i]);
			}
		}
		return 0;


	}
}

