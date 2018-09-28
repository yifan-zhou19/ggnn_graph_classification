package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int j = 0;
		int sum = 0;
		int[] r = new int[100];
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if ((a <= 140 && a >= 90) && (b <= 90 && b >= 60))
			{
				sum++;
			}
			else if ((a >= 140 || a <= 90) || (b >= 90 || b <= 60))
			{
				r[j] = sum;
				j++;
				sum = 0;
			}
			if (i == n - 1)
			{
				r[j + 1] = sum;
			}
		}

		for (int m = 0;m < j + 2;m++)
		{
			max = (max > r[m])?max:r[m];
		}

		System.out.printf("%d\n",max);

		return 0;
	}
}

