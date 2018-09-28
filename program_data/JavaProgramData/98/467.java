package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = -1;
		int k = 0;
		int[] a = new int[1000];
		int p = 0;
		char[][] b = new char[1000][42];
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{

		c = System.in.read();
			if (c == ' ' || c == '\n')
			{
				b[i][k] = '\0';
				a[i] = String.valueOf(b[i]).length();
				i = i + 1;
				k = 0;
				continue;
			}
	b[i][k] = c;
			k = k + 1;

		}

	for (i = 0;i < n;i++)
	{
		p = p + 1 + a[i];

		if (p < 81 && (p + a[i + 1]) < 81 && i < n - 1)
		{
		System.out.printf("%s ",b[i]);
		}
	else if (p = 81 && i < n - 1)
	{
		System.out.printf("%s\n",b[i]);
		p = 0;
	}
	else if (p < 81 && (p + a[i + 1])>81 && i < n - 1)
	{
		System.out.printf("%s\n",b[i]);
		p = 0;
	}
	else if (i = n - 1)
	{
	System.out.printf("%s\n",b[i]);
	}

	}

	}

}

