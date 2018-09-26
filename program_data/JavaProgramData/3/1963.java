package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000]; //judge???????
		int n;
		int k;
		int i;
		int j;
		int judge = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < (n - 1);i++) //????????????????
		{
			for (j = i + 1;j < n;j++)
			{
				if ((a[i] + a[j]) == k)
				{
					System.out.print("yes");
					judge = 1;
					break;
				}
			}
			if (judge != 0)
			{
				break;
			}
		}
		if (judge == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

}

