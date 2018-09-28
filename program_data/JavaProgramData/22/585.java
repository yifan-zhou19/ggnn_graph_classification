package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int m;
		int x;
		int y;
		char b = ',';
		for (n = 0;b == ',';n++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
		b = System.in.read();
		}
		m = 0;
		x = (a[m] >= a[m + 1])?a[m]:a[m + 1];
		a[m + 1] = (a[m] >= a[m + 1])?a[m + 1]:a[m];
		m++;
		while (m < n - 1)
		{
			if (x < a[m + 1])
			{
				y = x;
				x = a[m + 1];
				a[m + 1] = y;
			}
			else if (x == a[m + 1] && x != a[m])
			{
				a[m + 1] = a[m];
			}
			else if (x != a[m])
			{
				a[m + 1] = (a[m] >= a[m + 1])?a[m]:a[m + 1];
			}
			m++;
		}
		if (n == 1)
		{
			System.out.print("No");
		}
		else if (x == a[m])
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",a[m]);
		}
		return 0;
	}
}

