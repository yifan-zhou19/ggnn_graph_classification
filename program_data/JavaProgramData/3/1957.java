package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //???a??????
		int k = 0;
		int i = 0;
		int j = 0;
		int[] a = new int[1000];
		int q = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++) //????????????  ?????k
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					q++;
				}
			}
		}
		if (q >= 1)
		{
			System.out.print("yes");
			System.out.print("\n");
		}
		else
		{
			System.out.print("no");
			System.out.print("\n");
		}
		return 0;
	}
}

