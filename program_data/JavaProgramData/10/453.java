package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[30];
		int[] m = new int[30];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m[0] = 1;
		int temp = 1;
		for (int i = 1; i < k; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int tempmax = 0;
			for (int j = i - 1; j >= 0; j--)
			{
				if (a[i] <= a[j] != 0 && m[j] > tempmax)
				{
					tempmax = m[j];
				}
			}
			m[i] = tempmax + 1;
			if (m[i] > temp)
			{
				temp = m[i];
			}
		}
		System.out.print(temp);
		System.out.print("\n");
		return 0;
	}
}

