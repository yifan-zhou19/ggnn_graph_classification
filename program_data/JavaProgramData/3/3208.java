package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1000];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int j = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{

				if (k == a[i] + a[j])
				{
					System.out.print("yes");
					System.out.print("\n");
					return 0;
				}
			}
		}
		 System.out.print("no");
		 System.out.print("\n");
	}

}

