package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum;
		int c;
		int d;
		int temp;
		int e;
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		temp = 0;
		int[] a = new int[50000];
		int[] b = new int[50000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		c = a[0];
		d = b[0];
		a[0] = 10001;
		for (i = 0;i < n;i++)
		{
			if (a[i] < a[0])
			{
				a[0] = a[i];
				b[0] = b[i];
			}
		}
		for (i = 1;i < n;i++)
		{
			if (a[i] == a[0] && b[i] == b[0])
			{
				a[i] = c;
				b[i] = d;
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					e = a[j];
					a[j] = a[j + 1];
					a[j + 1] = e;
					f = b[j];
					b[j] = b[j + 1];
					b[j + 1] = f;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			sum = 0;
			for (j = 0;j < i;j++)
			{
				if (a[i] <= b[j])
				{
					sum++;
				}
			}
			if (sum == 0)
			{
				temp++;
			}
		}
		g = 0;
		for (i = 0;i < n;i++)
		{
			if (g < b[i])
			{
				g = b[i];
			}
		}
		if (temp == 0)
		{
			System.out.printf("%d %d",a[0],g);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

