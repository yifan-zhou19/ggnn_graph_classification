package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		int i = 0;
		int j;
		int t = 0;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 0;t <= n - 1;t++) //?????
		{
			a[t] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n - 1;i++)
		{
				for (j = i + 1;j <= n - 1;j++)
				{
				if (a[i] + a[j] == k)
				{
					flag = 1;
					System.out.print("yes");
					break;
				} //????????????k
				}
			if (flag == 1)
			{
				break; //????
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

