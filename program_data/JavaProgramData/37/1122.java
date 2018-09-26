package <missing>;

public class GlobalMembers
{
	// tiaoshi.cpp : Defines the entry point for the console application.
	//



	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[100001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			int l = a.length() - 1;
			int[] b = new int[123];
			int[] c = new int[123];
			int k;
			for (j = 0;j <= 122;++j)
			{
				b[j] = 0;
				c[j] = 0;
			}
			for (j = 0;j <= l;++j)
			{
				for (k = 97;k <= 122;++k)
				{
					if (a.charAt(j) == k)
					{
						b[k]++;
					}
				}
			}
			int flag = 0;
			k = 0;
			for (j = 97;j <= 122;++j)
			{
				if (b[j] == 1)
				{
					flag = 1;
					c[k] = j;
					k++;
				}
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
			else
			{
			int p = 0;
			for (j = 0;j <= l;++j)
			{
				for (p = 0;p <= k - 1;++p)
				{
					if (a.charAt(j) == c[p])
					{
						System.out.printf("%c\n",a.charAt(j));
						break;
					}
				}
				if (a.charAt(j) == c[p])
				{
					break;
				}
			}
			}
		}
		return 0;
	}


}

