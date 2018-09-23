package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] height = new int[25];

	public static int stop(int k)
	{
		int j;
		int max = 0;
		for (j = k + 1;j < n;j++)
		{
			if (height[j] <= height[k])
			{
				if (max < stop(j))
				{
				max = stop(j);
				}
			}
		}
		return max + 1;
	}
	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int MAX = 0;
		for (i = 0;i < n;i++)
		{
			height[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (MAX < stop(i))
			{
				MAX = stop(i);
			}
		}
		System.out.print(MAX);
		return 0;
	}

}

