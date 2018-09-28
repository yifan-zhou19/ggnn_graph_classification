package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] number = new int[500];
		int i;
		int k;
		int min;
		int[] odd = new int[500];
		int n;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number[i] = Integer.parseInt(tempVar2);
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (number[i] % 2 == 1)
			{
				odd[k] = number[i];
				k++;
			}
		}
		n = k;
		for (i = 0;i < n;i++)
		{
			min = i;
			for (k = i + 1;k < n;k++)
			{
				if (odd[min] > odd[k])
				{
					min = k;
				}
			}
			e = odd[min];
			odd[min] = odd[i];
			odd[i] = e;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d,",odd[i]);
		}
		System.out.printf("%d",odd[n - 1]);
		return 0;
	}

}

