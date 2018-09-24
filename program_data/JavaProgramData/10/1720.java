package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[30];
		int count = 0;
		int n;
		int temp;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < count;i++)
			{
				if (temp > a[i])
				{
				a[i] = temp;
				break;
				}
			}
			if (i >= count)
			{
				a[i] = temp;
				count++;
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;
	}
}

