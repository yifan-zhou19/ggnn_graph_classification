package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;
	int b = 0;
	int c = 0;
	int d = 0;
	int e;
	int i;
	int k;
	int n;
	int del;
	int t;
	int m;
	int f;
	int p;
	int z;
	int x;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] q = new int[100001];

	{
		for (i = 0;i <= n - 1;i++)
		{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		q[i] = Integer.parseInt(tempVar2);
	}
		}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		del = Integer.parseInt(tempVar3);
	}
	q[n] = q[n + 1] = del;
	d = 0;
	z = 0,x = 0;
	t = 1;
	p = 0;
	 while (p < 2500)
	 {
		p = p + 1;
	 i = 0;
	 while (i < n - 1)
	 {
		if (q[i] == del)
		{
		for (k = i;k <= n - 1;k++)
		{
		q[k] = q[k + 1];
		}
		 i = i + 1;
		}
		else
		{
		i = i + 1;
		}
	 }



	 }
	c = 0;
	System.out.printf("%d",q[c]);
	c = c + 1;

	while ((q[c] != del) && (c < n))
	{
	System.out.printf(" %d",q[c]);
	c = c + 1;
	}

	}
}

