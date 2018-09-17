package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] length = new int[500]; //????
		int[] a = new int[500];
		int temp = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		length[1] = 1;
		for (i = 2;i <= n;i++) //?????????
		{
			temp = 0;
			for (j = 1;j < i;j++)
			{
				if (a[i] <= a[j])
				{
					if (temp < length[j])
					{
						temp = length[j];
					}
				}
			}
			length[i] = temp + 1;
		}
		int max = 0;
		for (i = 1;i <= n;i++) //?????
		{
			if (max < length[i])
			{
				max = length[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

