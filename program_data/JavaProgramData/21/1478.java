package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int r;
	float a;
	float c;
	c = 0F;
	a = 0F;
	r = 0;
	int[] k = new int[201];
	int[] m = new int[201];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 1;i <= n;i++)
	{
	c = (c + k[i]);
	}
	c = c / n;
	for (i = 1;i <= n;i++)
	{
		if ((k[i] > c != 0?(k[i] - c):(c - k[i])) > a)
		{
			a = (k[i] > c != 0?(k[i] - c):(c - k[i]));
			r = 1;
			m[1] = k[i];
		}
	else if ((k[i] > c != 0?(k[i] - c):(c - k[i])) == a)
	{
		r = r + 1;
		m[r] = k[i];
	}
	}
	for (i = 1;i <= r;i++)
	{
		System.out.printf("%d",m[i]);
	if (i != r)
	{
		System.out.print(",");
	}
	}
	System.out.print("\n");
	}

}

