package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < i;j++) //?????????????????????????
			{
				if (a[i] + a[j] == k)
				{
					System.out.print("yes");
					return 0; //?????????
				}
			}
		}
		System.out.print("no");

		return 0;
	}
}

