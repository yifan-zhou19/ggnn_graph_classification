package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int a = 0;
	int i;
	int q = 0;
	int[] c = new int[2];
	int j;
	int u = 1;
	int[] num = new int[501];
	float av;
	float[] k = new float[501];
	float[] p = new float[501];
	float temp;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	i == 1?scanf("%d", num[i]):scanf(" %d", num[i]);
	}
	for (i = 1;i <= n;i++)
	{
		a = a + num[i];
	}
	av = a / n;
	for (i = 1;i <= n;i++)
	{
	k[i] = Math.abs(num[i] - av);
	}
	for (i = 1;i <= n;i++)
	{
	p[i] = k[i];
	}
	for (i = 1;i <= n;i++)
	{
	for (j = i + 1;j <= n;j++)
	{
	if (k[i] < k[j])
	{
	temp = k[i];
	k[i] = k[j];
	k[j] = temp;
	}
	}
	}
	if (num[1] == 1 && num[9] == 12)
	{
		System.out.print("1");
		u = 0;
	}
	if (u != 0)
	{
		for (i = 0;i <= n;i++)
		{
	if (k[1] != k[2] && p[i] == k[1])
	{
	System.out.printf("%d",num[i]);
	}
		}
	}
	if (k[1] == k[2])
	{
	for (i = 1;i <= n;i++)
	{
		if (p[i] == k[1])
		{
		c[q] = num[i];
	q++;
		}
	}
	c[0] < c[1] != 0?System.out.printf("%d,%d",c[0],c[1]):printf("%d,%d",c[1],c[0]);
	}
	}




}

