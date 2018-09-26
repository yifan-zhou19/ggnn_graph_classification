package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] begin = new int[1000];
		int[] end = new int[1000];
		int i = 0;
		int j = 0;
		int sum = 0;
		int max = 0;
		int k;
		char dot = ',';
		while (dot == ',')
		{
			begin[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			dot = System.in.read();
		}
		while ((end[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			j++;
			dot = System.in.read();
			if (dot != ',')
			{
				break;
			}
		}
		for (k = 0;k < 1000;k++)
		{
			for (i = 0;i < j;i++)
			{
				sum += (begin[i] == k) - (end[i] == k);
			}
			if (sum > max)
			{
				max = sum;
			}
		}

		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

