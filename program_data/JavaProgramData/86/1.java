package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int iCase;
		int n;
		int i;
		int count;
		int[] a = new int[20];
		iCase = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (iCase-- != 0)
		{
			count = 60;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				if (a[i] + 3 * i > 60)
				{
					break;
				}
				if (a[i] + 3 * (i + 1) <= 60)
				{
					count -= 3;
				}
				if (a[i] + 3 * (i + 1) > 60)
				{
					count = a[i];
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}

}

