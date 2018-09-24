package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] input = new int[20000];
		int[] output = new int[20000];
		int i;
		int j;
		int k;
		int x;
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
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			x = 0;
			for (j = 0;j < i;j++)
			{
				if (input[i] == input[j])
				{
					x++;
										break;
				}
			}
			if (x == 0)
			{
				k++;
				output[k] = input[i];
			}
		}
		for (i = 1;i < k;i++)
		{
			System.out.printf("%d ",output[i]);
		}
		if (i == k)
		{
			System.out.printf("%d\n",output[i]);
		}
	return 0;
	}
}

