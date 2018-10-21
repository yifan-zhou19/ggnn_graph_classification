package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1010];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		//???? 
		for (int i = 0;i < n;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					System.out.print("yes");
					System.out.print("\n");
					return 0;
				}
			}
		}
		System.out.print("no");
		System.out.print("\n");
		return 0;
	}
}

