package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int[] n = new int[100];
		int max;
		int max2;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		i = 0;
		max = 0;
		max2 = 0;
		do
		{
			if (n[i] > max)
			{
				max = n[i];
			}
			i++;
		}while (i < k);
		i = 0;
		do
		{
			if (max2 <= n[i] & n[i] <= (max - 1))
			{
				max2 = n[i];
			}
			i++;
		}while (i < k);
		System.out.print(max);
		System.out.print("\n");
		System.out.print(max2);

		return 0;
	}
}

