package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] k = new int[100];
		int[] l = new int[26];
		int m = 0;
		int v;
		int j;
		char[][] c = new char[100][26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = tempVar3.charAt(0);
			}
			for (j = 0;j < String.valueOf(c[i]).length();j++)
			{
				l[(int)c[i][j] - 65] += 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (l[i] > m)
			{
				m = l[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (l[i] == m)
			{
				System.out.printf("%c\n%d\n",i + 65,l[i]);
				break;
			}
		}
		for (v = 0;v < n;v++)
		{
			for (j = 0;j < String.valueOf(c[v]).length();j++)
			{
				if (c[v][j] == i + 65)
				{
					System.out.printf("%d\n",k[v]);
				}
			}
		}
	}
}

