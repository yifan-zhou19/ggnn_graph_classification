package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[500];
		int N;
		int sum = -1;
		int[] z = new int[500];
		int m = 0;
		int a;
		int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < N;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(s[i]) = Integer.parseInt(tempVar2);
		}
	}
	for (int i = 0;i < N;i++)
	{
		if (s[i] % 2 == 1)
		{
			sum = sum + 1;
		z[sum] = s[i];
		m = m + 1;
		}
	}
		for (int k = 0;k < m;k++)
		{
			for (int j = 0;j < m - 1;j++)
			{
				a = z[j];
				b = z[j + 1];
				if (z[j] > z[j + 1])
				{
				  z[j] = b;
				  z[j + 1] = a;
				}
			}
		}
	 for (int j = 0;j < m - 1;j++)
	 {
			System.out.printf("%d,",z[j]);
	 }
		System.out.printf("%d",z[m - 1]);
			return 0;

	}


}

