package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char w;
		int[] a = new int[300];
		int x;
		int t;
		int n;
		int k;
		int m;
		for (x = 0;w != '\n';x++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[x] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				w = tempVar2.charAt(0);
			}
		}
		for (k = x - 1;k > 0;k--)
		{
		for (n = 0;n < k;n++)
		{
		   if (a[n] > a[n + 1])
		   {
			 t = a[n];
			 a[n] = a[n + 1];
			 a[n + 1] = t;
		   }
		}
		}
		if (x == 1 || a[0] == a[x - 1])
		{
			System.out.print("No");
		}
		else
		{
			for (m = x - 1;a[m] == a[m - 1];m = m - 1)
			{
			}
		System.out.printf("%d",a[m - 1]);

		}



		return 0;
	}
}

