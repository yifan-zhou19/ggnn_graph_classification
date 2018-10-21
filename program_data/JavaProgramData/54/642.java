package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int h = 0;
		int[] f = new int[10];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}

		for (j = 1;;j++)
		{

			f[0] = n * j + k;
			for (i = 0;i < n - 1;i++)
			{
					f[i + 1] = f[i] * n / (n - 1) + k;
					if (((f[i + 1] - k) * (n - 1)) % n != 0)
					{
						break;
					}
					if (i == n - 2)
					{
						h = 1;
						break;
					}
			}
			if (h == 1)
			{
				break;
			}
		}


		System.out.printf("%d",f[n - 1]);
		return 0;
	}



}

