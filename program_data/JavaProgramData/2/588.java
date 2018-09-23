package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[1000];
		int max = 0;
		int t;
		int[] p = new int[26];
		char[][] c = new char[1000][27];
		char d;
		char[] l = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(c[i]).length();j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (c[i][j] == l[k])
					{
						p[k] += 1;
					}
				}
			}
		}
		for (k = 0;k < 26;k++)
		{
			if (p[k] > max)
			{
			max = p[k];
			t = k;
			}
		}
			System.out.printf("%c\n%d\n",l[t],max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(c[i]).length();j++)
			{
				if (c[i][j] == l[t])
				{
					System.out.printf("%d\n",a[i]);
				break;
				}
			}
		}

	}

}

