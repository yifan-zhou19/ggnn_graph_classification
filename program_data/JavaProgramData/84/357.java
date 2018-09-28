package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int min;
		int max1 = 0;
		int max2 = 0;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		min = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] > max1)
			{
				max1 = a[i];
				j = i;
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		a[j] = min;
		for (i = 0;i < n;i++)
		{
			if (a[i] > max2)
			{
				max2 = a[i];
			}
		}
		System.out.print(max1);
		System.out.print("\n");
		System.out.print(max2);
		System.out.print("\n");
	return 0;
	}
}

