package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int j;
		int i;
		int k = 0;
		int sum = 0;
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] c = new int[12];
		int[] y = new int[365];
		int[] x = new int[53];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	m = n;
	for (i = 0;i < 12;i++)
	{
		c[i] = sum + 13;
	sum = sum + d[i];
	}
	for (j = 0;j < 365;j++)
	{
		y[j] = j + 1;
	}
	for (i = 0;i < 365;i++)
	{
	if (m == 5)
	{
		x[k] = y[i];
	k = k + 1;
	}
	m = m + 1;
	if (m == 8)
	{
	m = 1;
	}
	}
	for (i = 0;i < 12;i++)
	{
		for (j = 0;j < 53;j++)
		{
	if (c[i] == x[j])
	{
	System.out.printf("%d\n",i + 1);
	}
		}
	}
	}

}

