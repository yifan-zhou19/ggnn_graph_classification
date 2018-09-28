package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[5];
		int i;
		int j;
		int sum = 0;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = n / 10000;
		a[1] = n / 1000 - 10 * a[0];
		a[2] = n / 100 - 10 * a[1] - 100 * a[0];
		a[3] = n / 10 - 10 * a[2] - 100 * a[1] - 1000 * a[0];
		a[4] = n - 10 * a[3] - 100 * a[2] - 1000 * a[1] - 10000 * a[0];
		for (i = 0;i <= 4;i++)
		{
			if (a[i] != 0)
			{
				j = i;
				break;
			}
		}
		for (i = 4;i >= j;i--)
		{
			b = (int)Math.pow(10,(i - j));
			sum += a[i] * b;
		}
		System.out.printf("%d",sum);
		return 0;
	}







}

