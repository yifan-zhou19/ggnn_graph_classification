package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char temp;
		int[] c = new int[1000];
		int[] d = new int[1000];
		int i = 0;
		int j = 0;
		int t = 0;
		int k = 0;
		int count = 0;
		int max = 0;
		int sum;
		while (true)
		{
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			temp = System.in.read();
				if (temp != ',')
				{
					break;
				}
				i++;
		}
		i = 0;
		while (true)
		{
			d[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			temp = System.in.read();
				if (temp != ',')
				{
					break;
				}
				i++;
		}
		sum = i + 1;
			System.out.print(sum);
			System.out.print(" ");
		for (k = 1;k <= 1000;k++)
		{
			for (j = 0;j <= sum - 1;j++)
			{
				if (c[j] <= k != 0 && d[j]> k)
				{
					count++;
				}
			}
				if (count > max)
				{
					max = count;
				}
				count = 0;
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}








}

