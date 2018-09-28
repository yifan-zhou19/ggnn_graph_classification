package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int t;
		int e;
		int sum1 = 0;
		int sum2 = 0;
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
		for (i = m;i <= n;i++)
		{
			t = i;
			e = 0;
			while (t != 0)
			{
				e = (e * 10 + t % 10);
				t /= 10;
			}
			if (e == i)
			{
				a[sum1] = i;
				sum1++;
			}
		}
		for (i = 0;i < sum1;i++)
		{
			for (j = 2;j <= Math.sqrt(a[i]);j++)
			{
				if (a[i] % j == 0)
				{
					break;
				}
			}
			if (j > Math.sqrt(a[i]))
			{
				b[sum2] = a[i];
				sum2++;
			}
		}
		if (sum2 == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d",b[0]);
			for (i = 1;i < sum2;i++)
			{
				System.out.printf(",%d",b[i]);
			}
			System.out.print("\n");
		}
	}
}

