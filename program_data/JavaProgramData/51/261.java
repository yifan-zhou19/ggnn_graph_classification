package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String c = new String(new char[501]);
		c = new Scanner(System.in).nextLine();
		char[][] s = new char[500][6];
		int i;
		int l = c.length();
		int j;
		int[] a = new int[501];
		for (i = 0;i <= l - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				s[i][j] = c.charAt(i + j);
			}
			s[i][j] = 0;
		}
	/*	for(i=0;i<=l-n;i++)
			puts(s[i]);*/
		for (i = 0;i <= l - n;i++)
		{
			a[i] = 1;
		}
		for (i = 0;i <= l - n;i++)
		{
			for (j = i + 1;j <= l - n;j++)
			{
				if (strcmp(s[i],s[j]) == 0)
				{
					a[i]++;
				}
			}
		}
	/*	for(i=0;i<=l-n;i++)
			printf("%d\n",a[i]);*/
		int k = 0;
		for (i = 0;i <= l - n;i++)
		{
			if (a[i] > k)
			{
				k = a[i];
			}
		}
		if (k <= 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",k);
		for (i = 0;i < l - n;i++)
		{
			if (a[i] == k)
			{
				System.out.println(s[i]);
			}
		}
		}
	}
}

