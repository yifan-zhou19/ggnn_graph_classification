package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] min = new int[26];
		int[] data = new int[26];
		int N;
		int i;
		int j;
		int minLength;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0 ; i < N ; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				data[i] = Integer.parseInt(tempVar2);
			}
		}
		min[0] = 1;
		for (i = 1 ; i < N ; i++)
		{
			minLength = 0;
			for (j = 0 ; j < i ; j++)
			{
				if (data[i] <= data[j])
				{
					if (min[j] > minLength)
					{
						minLength = min[j];
					}
				}
			}
			min[i] = minLength + 1;
		}
		//zhaozuixiao
		minLength = 0;
		for (i = 0 ; i < N ; i++)
		{
			if (min[i] > minLength)
			{
				minLength = min[i];
			}
		}

		System.out.printf("%d\n", minLength);
	}


}

