package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int i;
		int r = 0;
		int p;
		int N;
		int m = 0;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			p = a[i] % 2;
			if (p == 1)
			{
				b[r] = a[i];
				r++;
			}
		}
		for (m = 1;m < r;m++)
		{
			for (i = 0;i < r - m;i++)
			{
				if (b[i] > b[i + 1])
				{
					temp = b[i];
					b[i] = b[i + 1];
					b[i + 1] = temp;
				}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < r;i++)
		{
			System.out.printf(",%d",b[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

