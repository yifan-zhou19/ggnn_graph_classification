package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int sum = 0;
		int[] a = new int[100000];
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = n;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < sum;i++)
		{
			if (a[i] == k)
			{
				for (j = i;j < sum;j++)
				{
					a[j] = a[j + 1];
				}
				sum--;
				i--;
			}
		}
		for (i = 0;i < sum;i++)
		{
			System.out.print(a[i]);
			if (i == sum - 1)
			{
				System.out.print("\n");
				break;
			}
			System.out.print(" ");
		}
		return 0;
	}
}

