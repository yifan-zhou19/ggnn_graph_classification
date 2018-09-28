package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] count = new int[100];
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			count[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				count[i] = 1;
				for (j = i + 1;j < n;j++)
				{
					if (a[j] >= 90 && a[j] <= 140 && b[j] >= 60 && b[j] <= 90)
					{
						count[i]++;
					}
					else
					{
						break;
					}
				}
			}
		}
		int max = 0;
		for (i = 0;i < n;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

