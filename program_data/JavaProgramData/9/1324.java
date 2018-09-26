package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[100][100];
		char[][] a = new char[100][100];
		String b = new String(new char[100]);
		int n;
		int i;
		int j = 0;
		int[] sz = new int[100];
		int t;
		int c;
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
			s[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sz[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] < 60)
			{
				a[j] = s[i];
		j++;
			}
		}
		for (t = 1;t <= n;t++)
		{
		   for (i = 0;i < n - t;i++)
		   {
			if (sz[i] < sz[i + 1])
			{
				c = sz[i + 1];
				sz[i + 1] = sz[i];
				sz[i] = c;
				b = s[i + 1];
				s[i + 1] = s[i];
				s[i] = b;
			}
		   }
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] >= 60)
			{
				System.out.printf("%s\n",s[i]);
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
	return 0;
	}

}

