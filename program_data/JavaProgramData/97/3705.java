package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

	int[] a = new int[10];
	int[] b = new int[10];
	int i;
	int n;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a[1] = 100;
	a[2] = 50;
	a[3] = 20;
	a[4] = 10;
	a[5] = 5;
	a[6] = 1;

	for (i = 1;i <= 6;i++)
	{
		for (p = 1;p * a[i] <= n;p++)
		{
		}
		b[i] = p - 1;
		n = n - b[i] * a[i];
	}

	for (i = 1;i <= 6;i++)
	{
		System.out.printf("%d\n",b[i]);

	}

	}

}

