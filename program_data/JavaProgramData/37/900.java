package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int len;
		int t = 0;
		int[] num = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char letter;
		char[][] c = new char[100][10000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
		}
		for (k = 0;k < n;k++)
		{
			t = 0;
			for (i = 0;i < 26;i++)
			{
				num[i] = 0;
			}
			len = String.valueOf(c[k]).length();
			for (j = 97;j <= 122;j++)
			{
			   for (i = 0;i < len;i++)
			   {
					if (c[k][i] == j)
					{
						num[j - 97]++;
					}
			   }
			}
			for (i = 0;i < len;i++)
			{
				for (j = 97;j <= 122;j++)
				{
					if (c[k][i] == j && num[j - 97] == 1)
					{
						t = 1;
						break;
					}
				}
				if (t == 1)
				{
					System.out.printf("%c\n",c[k][i]);
					break;
				}
			}
			if (t == 0)
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

