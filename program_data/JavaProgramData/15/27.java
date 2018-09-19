package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int i;
		int j;
		int t;
		int t1;
		int t2;
		int[] a = new int[10000];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[0] = 255;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j + 1] = Integer.parseInt(tempVar2);
				}
				if (a[j] == 0 && a[j - 1] == 255)
				{

					t1 = j;
				}

				if (a[j - 1] == 0 && a[j] == 255)
				{
					t2 = j - 1;
				}

			}
		}
		System.out.printf("%d",(t2 - t1 - 1) * (t2 - t1 - 1));
		return 0;
	}
}

