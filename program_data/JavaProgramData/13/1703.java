package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		for (int i = 1;i < n;i++)
		{
			for (int j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					a[i] = 1;
				}
			}
		}
		for (int i = 1;i < n;i++)
		{
			if (a[i] > 1)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		return 0;


	}

}

