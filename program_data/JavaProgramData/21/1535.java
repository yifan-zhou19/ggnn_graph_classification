package <missing>;

public class GlobalMembers
{
	// ?????.cpp : ??????????????
	//



	public static void bubble(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i <= n - 2;i++)
		{
			for (j = 0;j <= n - j - 2;j++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
	}


	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int sum = 0;
		float ave;
		float difa;
		float difb;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
		}
		bubble(a, n);
		for (i = 0;i <= n - 1;i++)
		{
			sum += a[i];
		}
		ave = sum * 1.0 / n;
		difa = Math.abs(ave - a[0]);
		difb = Math.abs(ave - a[n - 1]);
		if (difa > difb)
		{
			System.out.printf("%d",a[0]);
		}
		else if (difa == difb)
		{
			System.out.printf("%d,%d",a[0],a[n - 1]);
		}
		else
		{
			System.out.printf("%d",a[n - 1]);
		}

		return 0;
	}


}

