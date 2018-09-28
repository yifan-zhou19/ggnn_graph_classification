package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int test1 = int;
	int test2 = int;
	int m;
	int n;
	int x;
	int i;
	int k = 0;
	int f1 = 0;
	int f2 = 0;
	int[] r = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 0;i <= (n - m);i++)
	{
	x = m + i;
	f1 = test1(x);
	f2 = test2(x);
	if (f1 != 0 && f2 != 0)
	{
		r[k] = x;
		k++;
	}
	}
	if (k > 0)
	{
		System.out.printf("%d",r[0]);
	for (i = 1;i < k;i++)
	{
	System.out.printf(",%d",r[i]);
	}
	}
	else if (k == 0)
	{
		System.out.print("no");
	}
	System.out.print("\n");

	}
	public static int test1(int x)
	{
	int j;
	int f1 = 1;
	int s;
	s = Math.sqrt(x) + 1;
	for (j = 2;j < s;j++)
	{
		if (x % j == 0)
		{
			f1 = 0;
			break;
		}
	}
	return (f1);
	}
	public static int test2(int x)
	{
	int n;
	int j;
	int s = 10;
	int f2 = 1;
	int[] a = new int[5];
	if (x > 9999)
	{
		n = 5;
	}
	else if (x > 999 && x < 10000)
	{
		n = 4;
	}
	else if (x > 99 && x < 1000)
	{
		n = 3;
	}
	else if (x > 9 && x < 100)
	{
		n = 2;
	}
	else
	{
		n = 1;
	}
	for (j = 0;j < n;j++)
	{
	a[j] = (x % s) * 10 / s;
	s = s * 10;
	x = x - a[j];
	}
	for (j = 0;j < n / 2;j++)
	{
		if (a[j] != a[n - j - 1])
		{
			f2 = 0;
			break;
		}
	}
	return (f2);
	}
}

