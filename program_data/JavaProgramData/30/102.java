package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int t;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[0] = 1;
			if (i >= 1)
			{
				a[i] = a[i - 1] + 1;
			}
			t = a[i] / 10;
			s = a[i] % 10;
			if (a[i] % 7 == 0 || t == 7 || s == 7)
			{
				b[i] = 0;
			}
			else
			{
				b[i] = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			c[0] = b[0] * b[0];
			if (i >= 1)
			{
				c[i] = c[i - 1] + b[i] * b[i];
			}
		}
		System.out.printf("%d",c[n - 1]);
	}
}

