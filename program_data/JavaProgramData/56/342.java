package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] a = new int[5];
		int w;
		{
			if (k >= 0 && k < 10)
			{
				System.out.printf("%d",k);
			}
			else if (k >= 10 && k < 100)
			{
				a[1] = k % 10;
				a[2] = (k - a[1]) / 10;
				w = a[1] * 10 + a[2];
				System.out.printf("%d",w);
			}
			else if (k >= 100 && k < 1000)
			{
				a[1] = k / 100;
				a[2] = (k - a[1] * 100) / 10;
				a[3] = (k - a[1] * 100 - a[2] * 10);
				w = a[3] * 100 + a[2] * 10 + a[1];
				System.out.printf("%d",w);
			}
			else if (k >= 1000 && k < 10000)
			{
				a[1] = k / 1000;
				a[2] = (k - a[1] * 1000) / 100;
				a[3] = (k - a[1] * 1000 - a[2] * 100) / 10;
				a[4] = (k - a[1] * 1000 - a[2] * 100 - a[3] * 10);
				w = a[4] * 1000 + a[3] * 100 + a[2] * 10 + a[1];
				System.out.printf("%d",w);
			}
			else if (k >= 10000 && k < 100000)
			{
				a[1] = k / 10000;
				a[2] = (k - a[1] * 10000) / 1000;
				a[3] = (k - a[1] * 10000 - a[2] * 1000) / 100;
				a[4] = (k - a[1] * 10000 - a[2] * 1000 - a[3] * 100) / 10;
				a[5] = (k - a[1] * 10000 - a[2] * 1000 - a[3] * 100 - a[4] * 10);
				w = a[5] * 10000 + a[4] * 1000 + a[3] * 100 + a[2] * 10 + a[1];
				System.out.printf("%d",w);
			}
		}



		return 0;
	}

}

