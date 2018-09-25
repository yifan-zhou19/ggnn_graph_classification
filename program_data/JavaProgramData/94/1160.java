package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[500];
		int i;
		int j = 0;
		int z;
		int[] b = new int[500];
		int sum;
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
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j = j + 1;
			}
		}
		sum = j;
		for (i = 0;i < sum;i++)
		{
			for (z = i + 1;z < sum;z++)
			{
				if (b[i] > b[z])
				{
					temp = b[i];
					b[i] = b[z];
					b[z] = temp;
				}
			}
		}
		for (i = 0;i < sum;i++)
		{
			System.out.printf("%d",b[i]);
			if (i < (sum - 1))
			{
				System.out.print(",");
			}
		}
		return 0;
	}


}

