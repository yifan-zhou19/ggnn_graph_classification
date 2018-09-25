package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int j;
		int t;
		int sum = 0;
		float x;
		float y;
		float z;
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
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
			if (a[j] > a[j + 1])
			{
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}

		x = (float)sum / n;
		y = a[n - 1] - x;
		z = x - a[0];
		if (y > z)
		{
			System.out.printf("%d",a[n - 1]);
			for (i = 1;i < n - 1;i++)
			{
			if (a[i] - x == y)
			{
			System.out.printf(",%d",a[i]);
			}
			}
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i <= n - 1;i++)
			{
			if (a[i] - x == z || x - a[i] == z)
			{
			System.out.printf(",%d",a[i]);
			}
			}
		}
	}


}

