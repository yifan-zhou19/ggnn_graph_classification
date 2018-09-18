package <missing>;

public class GlobalMembers
{
	// ???:??
	// ??:????
	// ????:2011.10.25
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int temp;
		int count;
		i = 0;
		while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			count = 0;
			if (a [0] == -1)
			{
				break;
			}
			i = 1;
			while ((a [i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				if (a [i] < 1)
				{
					temp = i;
					break;
				}
				i++;
			}
			for (i = 0; i < temp - 1; i++)
			{
				for (j = i + 1; j < temp ; j++)
				{
					if (a [i] == 2 * a [j] || a [j] == 2 * a [i])
					{

						count++;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}

}

