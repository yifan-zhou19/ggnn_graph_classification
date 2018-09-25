package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int[] tmp = new int[27];
	public static int[] flight = new int[27];

	public static int Main()
	{
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < N;i++)
		{
			tmp[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < N;i++)
		{
			flight[i] = 0;
			for (int j = 0;j < i;j++)
			{
			  if (tmp[j] >= tmp[i] != 0 && flight[j] > flight[i])
			  {
				flight[i] = flight[j];
			  }
			}
			flight[i]++;
		}
		int max = 0;
		for (int i = 0;i < N;i++)
		{
		  if (flight[i] > max)
		  {
			  max = flight[i];
		  }
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

