package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int N;
		int[] b = new int[20];
		for (i = 2;i < 20;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}



		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		for (i = 0;i <= N - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			System.out.print("\n");
		}

		for (i = 0;i <= N - 1;i++)
		{
			System.out.printf("%d",a[b[i] - 1]);
			System.out.print("\n");
		}

		return 0;
	}
}

