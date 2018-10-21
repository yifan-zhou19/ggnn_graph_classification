package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[i] + a[j] == k) //?????
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

