package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[30];
		int k = 0;
		int i = 0;
		int j = 0;
		int[] b = new int[30];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		b[0] = 1;
		for (i = 1;i < k;i++)
		{
			int temp = 1;
			for (j = i - 1;j >= 0;j--)
			{
				if (a[j] >= a[i])
				{
					if ((b[j] + 1) > temp)
					{
						temp = b[j] + 1;
					}
				}
			}
			b[i] = temp;
		}
		int max = 0;
		for (i = 0;i < k;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}


}

