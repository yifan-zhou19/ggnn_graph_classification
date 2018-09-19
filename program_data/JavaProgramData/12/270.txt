package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int i;
		int j;
		int sum;

		while (true)
		{

			sum = 0;
			for (i = 1;;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[1] == -1)
				{
					break;
				}
				if (a[i] == 0)
				{
					break;
				}
				for (j = 1;j < i;j++)
				{
					if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
					{
						sum++;
					}
				}
			}
			if (a[1] != -1)
			{
				System.out.print(sum);
				System.out.print("\n");
			}
		if (a[1] == -1)
		{
			break;
		}
		}
		  return 0;
	}
}

