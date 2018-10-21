package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 1;
		int m;
		int k;
		int c;
		int j = 0;
		int t;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 3,c = k + 2;c <= n;k++,c++)
		{
			for (i = 2,m = 2;i < k / 2,m < c / 2;i++,m++)
			{
			if (k % i == 0 || c % m == 0)
			{
				break;
			}
			}
			if (k % i != 0 && i >= k / 2 && c % m != 0 && m >= c / 2)
			{
				a[j] = k;
				b[j] = c;
				t = j;
				j++;
			}
		}
		for (i = 0;i <= t;i++)
		{
			if (a[0] != 0)
			{
				System.out.printf("%d %d\n",a[i],b[i]);
			}
		}
		if (a[0] == 0)
		{
			System.out.print("empty");
		}
	}


}

