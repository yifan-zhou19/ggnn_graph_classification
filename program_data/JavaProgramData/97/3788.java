package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] sz = {100, 50, 20, 10, 5, 1};
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < 6;i++)
		{
			m = n / sz[i];
			n = n - m * sz[i];
			a[i] = m;

		}
		for (int p = 0;p < 6;p++)
		{
			System.out.printf("%d\n",a[p]);
		}


			return 0;



	}

}

