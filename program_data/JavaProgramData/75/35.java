package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int k;
	int j;
	int[] a = new int[1001];
	int[] b = new int[1001];
	int[] t = new int[1001];
	int i = 0;
	int max = 0;
	char c = ',';
	while (c == ',')
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		i++;
	}
	i = 0;
	c = ',';
	while (c == ',')
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(null, 1);
		if (tempVar4 != null)
		{
			c = tempVar4.charAt(0);
		}
		i++;
	}
	for (j = 0;j < 1000;j++)
	{
		t[j] = 0;
	for (k = 0;k < i;k++)
	{
		if ((j >= a[k]) && (j < b[k]))
		{
			t[j]++;
		}
	}
	}
	for (j = 0;j < 1000;j++)
	{
		if (t[j] > max)
		{
			max = t[j];
		}
	}
	System.out.printf("%d %d",i,max);
	}

}

