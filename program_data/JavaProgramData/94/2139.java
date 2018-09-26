package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int n = 0;
		int[] num = new int[500];
		int i;
		int j;
		int number;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number = Integer.parseInt(tempVar2);
			}
			if (number % 2 != 0)
			{
				n = n + 1;
				num[n - 1] = number;
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (num[j] > num[j + 1])
				{
					number = num[j + 1];
					num[j + 1] = num[j];
					num[j] = number;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",num[i]);
			if (i < n - 1)
			{
				System.out.print(",");
			}
		}
		System.out.print("\n");
		return 0;
	}



}

