package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String c = new String(new char[555]);
	char c1;
	int tt2;
	int tt;
	int i;
	int j;
	int k;
	int l;
	int m;
	int n;
	int max;
	int[] a = new int[555];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	l = 0;
	tt = 1;
	c1 = System.in.read();
	while ((tt = 1) != 0)
	{
	c1 = System.in.read();
	if (c1 == '\n')
	{
	tt = 0;
	break;
	}
	else
	{
	l++;
	c = tangible.StringFunctions.changeCharacter(c, l, c1);
	}
	}
	for (i = 1;i <= l;i++)
	{
	a[i] = 0;
	}
	max = 1;
	if (l < n)
	{
		System.out.print("NO");
	}
	else
	{
	for (i = 1;i <= l - n + 1;i++)
	{
	for (j = i;j <= l - n + 1;j++)
	{
	tt = 0;
	for (k = 0;k <= n - 1;k++)
	{
	if (c.charAt(i + k) != c.charAt(j + k))
	{
	tt = 1;
	}
	}
	if (tt == 0)
	{
	a[i]++;
	}
	}
	if (a[i] > max)
	{
	max = a[i];
	}
	}
	tt2 = 0;
	tt = 0;
	if (max == 1)
	{
	System.out.print("NO");
	}
	else
	{
	System.out.print(max);
	System.out.print('\n');
	for (i = 1;i <= l - n + 1;i++)
	{
	if (a[i] == max)
	{
	tt2 = 1;
	if (tt != 0)
	{
	System.out.print('\n');
	}
	 for (j = 0;j <= n - 1;j++)
	 {
	 System.out.print(c.charAt(i + j));
	 }
	tt = 1;
	}
	}
	}
	}

	return 0;
	}
}

