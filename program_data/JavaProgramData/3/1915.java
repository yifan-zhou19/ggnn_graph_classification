package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??
		int k;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int ans = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++) //????????????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = k - a[i];
		}
		for (int i = 1;i <= n;i++) //??????????
		{
			for (int j = 1;i <= n != 0 && j != i;j++)
			{
				if (a[i] == b[j])
				{
				ans = 1;
				}
			}
		}
		if (ans == 1) //??????
		{
		System.out.print("yes");
		}
		else
		{
		System.out.print("no");
		}
		return 0;
	}
}

