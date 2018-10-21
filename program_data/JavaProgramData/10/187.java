package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int temp = 0;
		int max = 1;
		int z = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[30];
		int[] b = new int[30];
		for (int i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		b[0] = 1;
		for (int i = 1;i < k;i++)
		{
			for (int j = 0;j < i;j++)
			{
				if (a[j] >= a[i])
				{
					temp = b[j] + 1;
					if (max < temp)
					{
						max = temp;
					}
				}
			}
			b[i] = max;
			if (max > z)
			{
				z = max;
			}
			max = 1;
		}
		System.out.print(z);
		return 0;
	}

}

