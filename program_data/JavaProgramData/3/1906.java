package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int flag;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		flag = 0; //???????????
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < i;j++)
			{
				if (a[j] + a[i] == k)
				{
					flag = 1; //????
				}
			}
		}
		if (flag == 1)
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

