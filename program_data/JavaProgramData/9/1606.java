package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] p = new char[200][10];
		char[][] q =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String c = new String(new char[10]);
	int[] a = new int[200];
	int[] b = new int[200];
	int n;
	int i;
	int j;
	int x;
	int y;
	int t;
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
			p[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	}
	j = 0;
	x = 0;
	t = 0;
	y = 0;
	for (i = 0;i < n;i++)
	{
		if (a[i] >= 60)
		{
		b[j] = a[i];
		q[j] = p[i];
		j++;
		t++;
		}
	}
	for (j = t - 1;j > 0;j--)
	{
	for (i = 0;i < j;i++)
	{
	if (b[i] < b[i + 1])
	{
	int r;
	r = b[i + 1];
	c = q[i + 1];
	b[i + 1] = b[i];
	q[i + 1] = q[i];
	b[i] = r;
	q[i] = c;
	}
	}
	}
	for (i = 0;i < t;i++)
	{
		System.out.printf("%s\n",q[i]);
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] < 60)
		{
		System.out.printf("%s\n",p[i]);
		}
	}
	return 0;
	}

}

