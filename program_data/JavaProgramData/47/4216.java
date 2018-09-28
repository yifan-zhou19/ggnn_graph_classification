package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //?????????a,b
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = a[n - 1 - i]; //????
			if (i < n - 1)
			{
			System.out.print(b[i]);
			System.out.print(" ");
			}
			else
			{
				System.out.print(b[i]);
			}
		}
		return 0;
	}

}

