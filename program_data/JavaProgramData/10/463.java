package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int[] h = new int[25];
	public static int[] l = new int[25];
	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0; i < k; i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			l[i] = 0;
		}
		l[0] = 1;

		for (i = 1; i < k; i++)
		{
			int temp = -1;
			for (j = 0; j < i; j++)
			{
				if (h[j] >= h[i] != 0 && l[j] + 1 > temp)
				{
					temp = l[j] + 1;
				}
			}
			if (temp == -1)
			{
				l[i] = 1;
			}
			else
			{
				l[i] = temp;
			}
		}
		int res = -1;

		for (i = 0; i < k; i++)
		{
			if (l[i] > res)
			{
				res = l[i];
			}
		}
		System.out.print(res);
		System.out.print("\n");


		return 0;
	}
}

