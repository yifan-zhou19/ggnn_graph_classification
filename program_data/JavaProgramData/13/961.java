package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[20000];
		int counter = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			if (i == j)
			{
				counter++;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			if (i == j)
			{
				System.out.print(a[i]);
			counter--;
			if (counter != 0)
			{
				System.out.print(' ');
			}
			}
		}
		return 0;
	}
}

