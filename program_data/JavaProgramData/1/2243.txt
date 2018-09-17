package <missing>;

public class GlobalMembers
{
	public static int devide(int n,int k)
	{
		int s;
		int i;
		s = 1;
		for (i = k;i <= Math.sqrt(n * 1.0);i++)
		{
			if (n % i == 0)
			{
				s = s + devide(n / i, i);
			}
		}
		return s;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[200];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				System.out.printf("%d",devide(a[i], 2));
			}
			else
			{
				System.out.printf("\n%d",devide(a[i], 2));
			}
		}
		return 0;
	}
}

