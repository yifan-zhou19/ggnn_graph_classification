package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

	int PrimeElement = new int(int n,int m);

	int n;
	int m;
	int i;
	int k;
	int t;
	m = 2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		t = PrimeElement(n, m);
		System.out.printf("%d\n",t);
	}
	}

	public static int PrimeElement(int n,int m)
	{
	int i;
	int t;
	t = 0;
	for (i = m;i <= Math.sqrt((double)(n));i++)

	{
		if (n % i == 0)
		{
				t = t + PrimeElement(n / i, i);
		}
	}
	t = t + 1;
	return t;
	}
}

