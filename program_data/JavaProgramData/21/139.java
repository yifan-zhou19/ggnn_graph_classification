package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] a = new int[300];
		int n;
		int t;
		float d;
		float s = 0F;
		float b;
		float c;
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
		for (i = 0;i < n;i++)
		{
			s = s + a[i];
		}
		d = s / n;
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
				b = d - a[0];
				c = a[n - 1] - d;
				if (b < c)
				{
					System.out.printf("%d\n",a[n - 1]);
				}
				else if (b > c)
				{
					System.out.printf("%d\n",a[0]);
				}
				else
				{
					System.out.printf("%d,%d\n",a[0],a[n - 1]);
				}
	}
}

