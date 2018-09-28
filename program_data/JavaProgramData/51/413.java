package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int s;
		int[] c = new int[505];
		int[] d = new int[505];
	for (i = 0;i < 505;i++)
	{
		c[i] = 0;
		d[i] = 0;
	}
	String a = new String(new char[505]);
	char[][] b = new char[505][6];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a = new Scanner(System.in).nextLine();
	t = a.length();
	for (i = 0;i <= t - n;i++)
	{
		for (j = i;j < i + n;j++)
		{
	b[i][j - i] = a.charAt(j);
		}
	b[i][j - i] = 0;
	}
	for (i = 0;i <= t - n;i++)
	{
	for (j = i + 1;j <= t - n;j++)
	{
	if (strcmp(b[i],b[j]) == 0)
	{
		c[i]++;
		d[i]++;
	}
	}
	}
	for (i = 0;i < t - n;i++)
	{
	for (j = 0;j < t - n - i;j++)
	{
	if (c[j] > c[j + 1])
	{
		s = c[j];
		c[j] = c[j + 1];
		c[j + 1] = s;
	}
	}
	}
	//for(i=0;i<=t-n;i++)
	//printf("%d\n",c[i]);
	if (c[t - n] == 0)
	{
		System.out.print("NO");
	}
	else
	{
		System.out.printf("%d\n",c[t - n] + 1);
	for (j = 0;j <= t - n;j++)
	{
	if (d[j] == c[t - n])
	{
		System.out.println(b[j]);
	}
	}
	}

	return 0;
	}
}

