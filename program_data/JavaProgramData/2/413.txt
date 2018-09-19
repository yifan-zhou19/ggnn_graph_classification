package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[400][400];
		char[][] t = new char[400][400];
		int n;
		int m;
		int i;
		int j;
		int k;
		int l;
		int p;
		int y;
		int z;
		char c;
		int[] a = new int[30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = tempVar3.charAt(0);
			}
		}
		j = 0;
		for (c = 65;c < 91;c++)
		{
			p = 0;
			for (k = 1;k <= n;k++)
			{
				l = String.valueOf(s[k]).length();
				for (m = 0;m < l;m++)
				{
					if (s[k][m] == c)
					{
						p++;
					}
				}
			}
			a[j] = p;
			j++;
		}
		for (i = 0;i < j;i++)
		{
			for (m = j - 2;m >= i;m--)
			{
				if (a[m] < a[m + 1])
				{
					y = a[m];
					a[m] = a[m + 1];
					a[m + 1] = y;
				}
			}
		}
		z = a[0];
		for (c = 65;c < 91;c++)
		{
			p = 0;
			for (k = 1;k <= n;k++)
			{
				l = String.valueOf(s[k]).length();
				for (m = 0;m < l;m++)
				{
					if (s[k][m] == c)
					{
						p++;
					}
				}
			}
			if (p == z)
			{
				System.out.printf("%c\n",c);
				System.out.printf("%d\n",z);

			for (k = 1;k <= n;k++)
			{
				p = 0;
				l = String.valueOf(s[k]).length();
				for (m = 0;m < l;m++)
				{
					if (s[k][m] == c)
					{
						p++;
					}
				}
				if (p > 0)
				{
					System.out.printf("%s\n",t[k]);
				}
			}
			break;
			}
		}
	}
}

