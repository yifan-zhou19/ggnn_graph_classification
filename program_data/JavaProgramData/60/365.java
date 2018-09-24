package <missing>;

public class GlobalMembers
{
	public static int matrix(int n)
	{
		int i;
		int j;
		int t;
		t = Math.sqrt(n);
		for (i = 3;i <= t;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i <= t)
		{
			j = 0;
		}
		if (i > t)
		{
			j = 1;
		}
		return j;
	}
	public static void Main()
	{
		int n;
		int i;
		int j = 1;
		int m = 0;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i += 2)
		{
			if (matrix(i) == 1)
			{
				a[j++] = i;
			}
		}
		a[0] = 2;
		for (i = 0;i < j;i++)
		{
			if (a[i] + 2 == a[i + 1])
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
				m++;
			}
		}
		if (m == 0)
		{
			System.out.print("empty\n");
		}
	}
}

