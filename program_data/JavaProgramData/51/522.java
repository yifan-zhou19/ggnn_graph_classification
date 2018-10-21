package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int[] c = new int[500];
		int k;
		String a = new String(new char[1000]);
		char[][] b = new char[500][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l - n + 1;i++)
		{
			for (j = i;j < i + n;j++)
			{
				b[i][j - i] = a.charAt(j);
			}
			b[i][n] = '\0';
		}
		for (i = 0;i < l - n + 1;i++)
		{
			c[i] = 1;
			for (j = i + 1;j < l - n + 1;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					c[i] = c[i] + 1;
				}
			}
		}
		k = 0;
		for (i = 0;i < l - n + 1;i++)
		{
			if (c[i] > k)
			{
				k = c[i];
			}
		}
		if (k <= 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",k);
		for (i = 0;i < l - n + 1;i++)
		{
			if (c[i] == k)
			{
				System.out.printf("%s\n",b[i]);
			}
		}
		}
		return 0;
	}
}

