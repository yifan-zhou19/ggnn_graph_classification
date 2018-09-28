package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[503]);
		final String str2 = "";
		int[] a = new int[503];
		int i;
		int j;
		int n;
		int p;
		int flag;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		t = str.length() - n;
		for (i = 0;i <= 502;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i <= t;i++)
		{
			for (j = i,p = 0;j <= i + n - 1;j++)
			{
				str2.charAt(i)[p] = str.charAt(j);
				p++;
			}
		}
		for (i = 0;i <= t;i++)
		{
			for (j = i - 1,flag = 0;j >= 0;j--)
			{
				if (strcmp(str2.charAt(i),str2.charAt(j)) == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0 || i == 0)
			{
				for (j = i;j <= t;j++)
				{
					if (strcmp(str2.charAt(i),str2.charAt(j)) == 0)
					{
						a[i]++;
					}
				}
			}
		}
		for (i = 0,k = 0;i <= t;i++)
		{
			if (a[i] > k)
			{
				k = a[i];
			}
		}
		if (k > 1)
		{
			System.out.printf("%d\n",k);
			for (i = 0;i <= t;i++)
			{
				if (a[i] == k)
				{
					System.out.printf("%s\n",str2.charAt(i));
				}
			}
		}
		else if (k = 1)
		{
			System.out.print("NO");
		}
		return 0;
	}

}

