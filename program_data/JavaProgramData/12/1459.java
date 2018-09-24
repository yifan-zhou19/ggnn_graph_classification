package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		while (true)
		{
			int i = 0;
			int[] a = new int[20];
			int sum = 0;
			do
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				i++;
			} while (a[i - 1] > 0);
			if (a[i - 1] == -1)
			{
				break;
			}
			for (int j = 0; j < i - 1 ; j++)
			{
				for (int k = 0; k < i - 1 ; k++)
				{
					if (a[j] * 2 == a[k])
					{
						sum++;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
	}
}

