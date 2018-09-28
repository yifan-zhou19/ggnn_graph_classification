package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int k = 0;
	int[] a = new int[1000];
	int[] b = new int[1000];
	int[] t = new int[1000];
	int i = 0;
	int p = 0;
	int j;
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
		p++;
		i++;
	}
	c = ',';
	i = 0;
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
	for (i = 0;i < 999;i++)
	{
		t[i] = 0;
	}
	for (i = 0;i < 999;i++)
	{
	 for (j = 0;j < p;j++)
	 {
		 if ((a[j] <= i) && (b[j]> i))
		 {
			 t[i]++;
		 }
	 }
	}
	for (i = 0;i < 999;i++)
	{
	if (t[i] > k)
	{
		k = t[i];
	}
	}
	System.out.printf("%d %d",p,k);
	}
}

