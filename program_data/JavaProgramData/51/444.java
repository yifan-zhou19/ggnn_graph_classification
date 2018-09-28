package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] k = new int[510];
	public static String a = new String(new char[510]);
	public static char[][] b = new char[510][5];
	public static void Main()
	{
		void ch(char a.charAt(),char b[][5]);
		void compare(char b[][5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		ch(a, b);
		compare(b);

	}
	public static void ch(String a, String[] b)
	{
		int i;
		int j;
		int k;
		for (i = 0;i <= a.length() - n;i++)
		{
			for (j = i,k = 0;j < i + n;j++,k++)
			{
				b[i][k] = a[j];
			}
			b[i][k] = '\0';
		}
	}
	public static void compare(String[] b)
	{
		int i;
		int j;
		int l;
		int e = 0;
		int o = a.length();
		char[][] c = new char[510][5];
		for (i = 0;i <= o - n;i++)
		{
			for (j = 0;j <= o - n;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					k[i]++;
				}
			}
		}
		l = k[0];
		for (i = 0;i <= o - n;i++)
		{
			if (k[i] > l)
			{
				l = k[i];
			}
		}
		c[0] = b[0];
		for (i = 0;i <= o - n;i++)
		{
			if (k[i] == l)
			{
				for (j = 0;j < e;j++)
				{
					if (strcmp(b[i],c[j]) == 0)
					{
						break;
					}
				}
				if (j == e)
				{
					c[e] = b[i];

					e++;
				}
			}
		}
	if (l == 1)
	{
		System.out.print("NO");
	}
	else
	{
	System.out.printf("%d\n",l);
		for (i = 0;i < e;i++)
		{
			System.out.printf("%s\n",c[i]);
		}
	}
	}
}

