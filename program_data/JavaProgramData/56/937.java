package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10];
		int i = 1;
		int j;
		int m;
		int n;
		int k;
		int sum = 0;
		int t = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 5;i++)
		{
			 if (t <= m != 0 && m < t * 10)
			 {
			  k = i + 1;
			  break;
			 }
			t *= 10;
		}
		for (j = k - 1;j >= 0;j--)
		{
			a[j] = m % 10;
			m = m / 10;
		}
		for (n = k - 1;n >= 0;n--)
		{
			sum = sum + a[n];
			sum *= 10;
		}
		sum = sum / 10;
		System.out.printf("%d\n",sum);
	}

}

