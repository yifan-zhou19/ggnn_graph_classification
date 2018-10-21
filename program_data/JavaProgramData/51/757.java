package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[501]);
	int n;
	int i;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	int t = s.length();
	char[][] a = new char[501][5];
	for (i = 0;i <= t - n;i++)
	{
	for (j = 0;j < 5;j++)
	{
	a[i][j] = s.charAt(i + j);
	}
	}
	int[] b = new int[501];
	int c;
	for (i = 1;i <= t - n;i++)
	{
		for (k = 0;k < i;k++)
		{
		c = 0;
		for (j = 0;j < n;j++)
		{
	if (a[i][j] == a[k][j])
	{
	c++;
	}
	else
	{
	break;
	}
	if (c == n)
	{
	b[k]++;
	}
		}
		}
	}
	c = b[0];
	for (i = 1;i <= t - n;i++)
	{
		if (b[i] > c)
		{
	c = b[i];
		}
	}
	if (c == 0)
	{
	System.out.print("NO");
	}
	else
	{
		System.out.printf("%d\n",c + 1);
	for (i = 0;i <= t - n;i++)
	{
		if (b[i] == c)
		{
		for (j = 0;j < n - 1;j++)
		{
	System.out.printf("%c",a[i][j]);
		}
	if (j == n - 1)
	{
	System.out.printf("%c\n",a[i][j]);
	}
		}
	}
	}
	}

}

