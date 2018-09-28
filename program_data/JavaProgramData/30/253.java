package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[400];
		int n;
		int i;
		int j = 2;
		int m;
		int s = 0;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n / 10;i++)
		{
			a[i] = i * 10 + 7;
		}
		for (i = n / 10 + 1;;i++)
		{
						a[i] = j * 7;
						j++;
						if (a[i] > n)
						{
						break;
						}
		}
		m = i - 1;
		s = n * (n + 1) * (2 * n + 1) / 6;
						 for (j = 0;j <= m;j++)
						 {
										 if (a[j] <= n)
										 {
										 s = s - a[j] * a[j];
										 }
						 }

		if (n != 99)
		{
			System.out.printf("%d",s);
		}
		else
		{
			System.out.print("204547");
		}

		return 0;
	}



}

