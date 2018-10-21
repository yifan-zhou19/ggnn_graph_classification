package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[21];
	public static void cal()
	{
		 a[0] = 1;
		 a[1] = 1;
		 for (int i = 2;i <= 20;i++)
		 {
		 a[i] = a[i - 1] + a[i - 2];
		 }
	}
	public static int Main()
	{
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		cal();
		while (t-- != 0)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",a[n - 1]);
		}

		return 0;
	}

}

