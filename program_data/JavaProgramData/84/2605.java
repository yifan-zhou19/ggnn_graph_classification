package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[101];
		int n = 0;
		int i;
		int max;
		int big;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max = 0;
		big = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}

			if (a[i] > max)
			{
				big = max;

				max = a[i];

			};


		}
		System.out.printf("%d\n",max);
		System.out.printf("%d",big);








	}
}

