package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[501]);
	char[][] c = new char[500][6];
	int n;
	int i;
	int k;
	int j;
	int m;
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
	k = a.length();
	int[] b = new int[500];
	for (i = 0;i <= k - n;i++)
	{
		for (j = 0;j < n;j++)
		{
			c[i][j] = a.charAt(i + j);
		}
	c[i][n] = 0;
	}
	for (i = 0;i < k - n;i++)
	{
		b[i] = 1;
	for (j = i + 1;j <= k - n;j++)
	{
		if (strcmp(c[i],c[j]) == 0)
		{
			b[i]++;
		}
	}
	}
	m = b[0];
	for (i = 1;i < k - n;i++)
	{
		if (b[i] > m)
		{
			m = b[i];
		}
	}
	if (m == 1)
	{
		System.out.print("NO");
	}
	else
	{
		System.out.printf("%d\n",m);
	for (i = 0;i < k - n;i++)
	{
		if (b[i] == m)
		{
			System.out.printf("%s\n",c[i]);
		}
	}
	}
	}
}

