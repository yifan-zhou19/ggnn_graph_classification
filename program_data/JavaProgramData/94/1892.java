package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] input = new int[501];
		int i;
		int p;
		int ex;
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
				input[i] = Integer.parseInt(tempVar2);
			}
			if (input[i] % 2 == 0)
			{
				i--;
				n--;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (p = 0;p < n - 1;p++)
			{
				if (input[p] > input[p + 1])
				{
					ex = input[p];
					input[p] = input[p + 1];
					input[p + 1] = ex;
				}
			}
		}
		System.out.printf("%d",input[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(",%d",input[i]);
		}




	return 0;
	}



}

