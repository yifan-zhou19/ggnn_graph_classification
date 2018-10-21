package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n; //????
		int k;
		int[] shu = new int[1000];
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		for (int i = 1;i < n;i++) //????
		{
			shu[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i < n;i++) //???i??
		{
			for (int j = i + 1;j <= n;j++) //??i????
			{
				m = shu[i] + shu[j]; //??
				if (m == k)
				{
						System.out.print("yes");
						j = n + 1; //????
						i = n + 1;
				}
				else if (i == n - 1 && j == n)
				{
					System.out.print("no");
				}
			}
		}
			return 0;
	}
}

